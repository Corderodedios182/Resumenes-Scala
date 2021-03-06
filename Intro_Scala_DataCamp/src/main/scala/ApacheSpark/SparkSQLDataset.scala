package ApacheSpark

import org.apache.spark.sql._
import org.apache.log4j._

object SparkSQLDataset extends App {

  case class Person(id:Int, name:String, age:Int, friends:Int)

  /** Our main function where the action happens */
  // Set the log level to only print errors
  Logger.getLogger("org").setLevel(Level.ERROR)

  // Use SparkSession interface
  val spark = SparkSession
      .builder
      .appName("SparkSQL")
      .master("local[*]")
      .getOrCreate()

    // Load each line of the source data into an Dataset
    import spark.implicits._
    val schemaPeople = spark.read
      .option("header", "true")
      .option("inferSchema", "true")
      .csv("src/main/resources/data/fakefriends.csv")
      .as[Person]

    schemaPeople.printSchema()

    schemaPeople.createOrReplaceTempView("people")

    val teenagers = spark.sql("SELECT * FROM people WHERE age >= 13 AND age <= 19")

    val results = teenagers.collect()

    results.foreach(println)

    spark.stop()
}