package lecturePart2OOP


/*En este Scrip podemos ver los siguientes ejemplos de Sintaxis como :

-- infix notation, métodos de un parametro
mary.likes("Inception")
mary likes "Inception"

-- prefix notation
mary.unary_!
!mary

-- postfix notation
mary.isAlive
mary isAlive

-- apply()
mary.apply("Hi there!)
mary("Hi there!)

*/


object MethodNotation extends App {

  class Person(val name: String, favoriteMovie:String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie

    def + (person: Person): String = s"${this.name} is handing out with ${person.name}"
    def + (nickname: String): Person = new Person(s"$name ($nickname", favoriteMovie)

    def unary_! : String = s"$name, what the heck?!"
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)

    def isAlive: Boolean = true

    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"
    def apply(n: Int): String = s"$name watched $favoriteMovie $n times"

    def learns(thing: String) = s"$name is learning $thing"
    def lerrnsScala = this learns "Scala"

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

  /*Ejercicios

  1 . Sobrecargar el operador + definido en la clase
      mary + "the rockstar" => new Person "Mary (the rockstar)"

  2. Agregar la edad de una Persona
     El operdaro unary + sume 1
     +mary => with the age incrementer

  3 . Agregar metodo "learns" => "Mary learns Scala"
      Agregar metodo learnsScala, llame learns metodo con "Scala"

  4 . Sobrecargar el método apply() reciba un número y devuelva una cadena
      mary .apply(2) => "Mary watched Inception 2 times"
  */

  println((mary + "the Rockstar").apply())
  println((+mary).age)
  println(mary.lerrnsScala)
  println(mary(10))

}
