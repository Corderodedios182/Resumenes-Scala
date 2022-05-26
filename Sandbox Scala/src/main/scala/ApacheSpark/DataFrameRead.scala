package ApacheSpark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{DoubleType, IntegerType, StringType, StructField, StructType}

object DataFrameRead  {

  val simpleSchema = StructType(Array(
    StructField("Acceleration", DoubleType, true),
    StructField("Cylinders", IntegerType, true),
    StructField("Displacement", DoubleType, true),
    StructField("Horsepower", IntegerType, true),
    StructField("Miles_per_Gallon", DoubleType, true),
    StructField("Name", StringType, true),
    StructField("Origin", StringType, true),
    StructField("Weight_in_lbs", DoubleType, true),
    StructField("Year", StringType, true)
  ))

  val spark = SparkSession.builder()
    .master("local[1]")
    .appName("DataFrame Basics")
    .config("spark.master","local")
    .getOrCreate()

  val carsDf = spark.read
    .format("json")
    .schema(simpleSchema)
    .option("multiline","true")
    .option("mode","failFast")
    .load("src/main/resources/input/cars.json")

  val carsTwoDf = spark.read
    .format("json")
    .options(Map("multiline" -> "true",
                 "path" -> "src/main/resources/input/cars.json"
    ))
    .load()

}
