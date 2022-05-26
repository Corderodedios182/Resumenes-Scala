package ApacheSpark

import org.apache.spark.sql.functions.{col, exp, expr}

object DataFramesTransform extends App {

  val carsDf = DataFrameRead.carsDf
  println(s"Número de registros : ${carsDf.count()}")
  carsDf.printSchema()
  carsDf.show()

  val carsOrigin = carsDf.groupBy("Origin")
                         .count()
                         .orderBy(col("count").asc)

  val carsName = carsDf.groupBy("Origin","Name" )
    .count()
    .orderBy(col("Origin").asc)

  println(s"Grupos Origin : ${carsOrigin.show()}")
  println(s"Grupos Name : ${carsName.show()}")

  // Expresiones
  val weight_in_kls = carsDf.col("Weight_in_lbs") / 2.2

  val carsDfWeightDf = carsDf.select(
    col("Name"),
    col("Weight_in_lbs").cast("double"),
    weight_in_kls.as("Weight_in_kls1"),
    expr("Weight_in_lbs/2.2").as("Weight_in_kls2")
  )
  carsDfWeightDf.show()

  // selectExpr
  val carsDfYear = carsDf.selectExpr("Origin", "substring(Year, 1,4) as year")
    .groupBy("Origin","year")
    .count()
    .orderBy(col("count").asc)

  carsDfYear.show()

  // Procesamiento
  val carDfProcess = carsDf
    .withColumn("Weight_in_kls", col("Weight_in_lbs")/2.2)
    .selectExpr("*", "substring(Year, 1,4) as yearOne")
    .filter(col("yearOne") === 1970)

  carDfProcess.printSchema()
  carDfProcess.show()

}
