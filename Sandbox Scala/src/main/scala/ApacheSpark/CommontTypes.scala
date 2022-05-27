package ApacheSpark

import org.apache.spark.sql.functions.{col, initcap, lit, regexp_extract, regexp_replace, when}
import org.apache.spark.sql.types.{IntegerType, StringType}

object CommontTypes extends App {

  var carsDf = DataFrameRead.carsDf
    .selectExpr("*", "cast(substring(Year, 1,4) as int) as YearN")

  carsDf = carsDf
    .select(carsDf.col("*"),
      lit( 0.42517006802721).as("Conversion_km"),
      initcap(col("Name")).as("NameC"))

  carsDf.show()

  //Condiciones Generales
  val Usa = col("Origin") equalTo ("USA")
  val Ford = col("Name").contains("ford")
  val Setentas = col("YearN") >= 1970 and col("YearN") <= 1979

  //Agregar columnas con Lit
  carsDf.withColumn("Decada",
    when(Setentas,
      lit("Setentas").cast(StringType))
      .otherwise("Ochentas"))
    .groupBy("Decada","Year", "YearN")
    .count()
    .orderBy("YearN")
    .show()

  //Condiciones Booleanas y filtros
  val FilterOne = Usa and Ford and Setentas

  carsDf.where(FilterOne).show()

  //Operaciones entre columnas.
  carsDf.select(carsDf.col("*"),
    (col("Miles_per_Gallon")  * col("Conversion_km")).as("Kilometro_por_litro"))
    .show()

  //Correlación
  println( "Correlación entre Cylinders y Miles_per_Gallon : "
    + carsDf.stat.corr("Cylinders","Miles_per_Gallon"))

  //Manejo de Expresiones Regulares
  val regexString = "volkswagen|vs"

  carsDf.select(carsDf.col("*"),
                regexp_extract(col("Name"), regexString, 0).as("regex_extract"),
                regexp_replace(col("Name"), regexString,"VW").as("regex_replace"))
        .where(col("regex_extract") =!= "")
        .show()

  //Multiples remplazsos
  def getCarName: List[String] = List("Volkswagen", "Mercedes-Benz", "Ford")

  val complexRegex = getCarName.map(_.toLowerCase()).mkString("|")

  carsDf.select(
                col("Name"),
                regexp_extract(col("Name"), complexRegex, 0).as("regex_extract"))
        .where(col("regex_extract") =!= "").show(100)

}
