package ApacheSpark

import org.apache.spark.sql.catalyst.dsl.expressions.StringToAttributeConversionHelper
import org.apache.spark.sql.functions.{col, countDistinct, exp, expr, split, udf}
import org.sparkproject.dmg.pmml.False

object DataFramesTransform extends App {

  val carsDf = DataFrameRead.carsDf

  //Analisis Exploratorio
  println(s"Número de registros : ${carsDf.count()}")

  carsDf.printSchema()
  carsDf.show()

  //Autos Origen por Pais
  carsDf.groupBy("Origin")
        .count()
        .orderBy(col("count").asc)
        .show()

  //Años de autos
  carsDf.selectExpr("substring(Year, 1,4) as yearOne")
    .groupBy("yearOne")
    .count()
    .orderBy(col("yearOne").asc)
    .show()

  //Nombres de Autos unicos
  carsDf.select(countDistinct(col("Name"))).show()

  //Estadisticas de los Autos.
  carsDf.describe().show()

  //Campos calculados.
  val kilometers_per_liter = carsDf.col("Miles_per_Gallon") * 0.42517006802721

  val carsDfnew = carsDf.select(carsDf.col("*"),
                                kilometers_per_liter.as("kilometers_per_liter"),
                                expr("Weight_in_lbs/2.2").as("Weight_in_kls"))
                        .selectExpr("*", "substring(Year, 1,4) as yearOne")
                        .withColumn("Marca", split(col("Name"), " ").getItem(0))

  carsDfnew.show()

  //Marcas
  carsDfnew.groupBy("yearOne","marca")
           .count()
           .orderBy(col("marca").asc)
           .show(truncate = false)

  carsDfnew.filter(col("Marca") === "ford").show(100)

}
