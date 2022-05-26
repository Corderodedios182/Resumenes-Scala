
import scala.io.Source

val filename = "C:/Users/indra/Documents/Github/mtcars.csv"

for(line <- Source.fromFile(filename).getLines){
  println(line)

  line
}
