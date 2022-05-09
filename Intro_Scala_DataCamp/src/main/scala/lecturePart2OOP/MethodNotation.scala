package lecturePart2OOP

object MethodNotation extends App {

  class Person(val name: String, favoriteMovie:String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def + (person: Person): String = s"${this.name} is handing out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception" ) //equivalent

  //"operators" in Scala
  val tom = new Person("Tom","Fight Club")
  println(mary + tom)
  println(mary.+ (tom))

  //Todos los Operadores son métodos
  println(1 + 2)
  println(1.+(2))

  //Notación de Prefijo
  val x = -1
  val y = 1.unary_-
  println(1.unary_+)
  println(1.unary_~)

  println(x == y)

  println(!mary)
  println(mary.unary_!)

  //Sufijo notación
  println(mary.isAlive)
  //println(mary isAlive)

  //apply
  println(mary.apply())
  println(mary())

}
