package ApacheSpark

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types.{DoubleType, IntegerType, StringType, StructField, StructType}

object DataFrameBasics  {

  val spark = SparkSession.builder()
    .appName("DataFrame Basics")
    .config("spark.master","local")
    .getOrCreate()

  val carsDF = spark.read
    .format("json")
    .option("multiline","true")
    .load("src/main/resources/data/cars.json")

}
