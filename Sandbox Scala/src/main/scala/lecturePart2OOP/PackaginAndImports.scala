package lecturePart2OOP

import ApacheSpark.DataFrameRead

//En caso de tener objectos con el mismo nombre podemos renombrar.
import java.util.Date
import java.sql.{Date => SqlDate}

object PackaginAndImports extends App {

  val carsDf = DataFrameRead.carsDf

  carsDf.show()

  val date = new Date
  val sqlDate = new SqlDate(2018,5,4)

  println(date)
  println(sqlDate)

}
