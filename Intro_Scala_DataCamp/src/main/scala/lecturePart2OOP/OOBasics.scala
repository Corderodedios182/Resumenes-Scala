package lecturePart2OOP

object OOBasics extends App{

  val person = new Person("Carly", 29)

  println("Tengo el val en mi parametro puedo acceder a este atributo : " + person.age)
  person.x
  person.greet("Tere")
  person.greet()

}

//Constructor
class Person(name: String, val age: Int = 0) {
  //body
  val x: Int = 1 + 3
  println("Soy un valor en la Clase Persona : " + x)

  // method
  def greet(name: String): Unit = println(s"${this.name} says : Hi, $name" )

  // overloading : Definir metodos con el mismo nombre pero diferentes firmas.
  def greet(): Unit = println(s"Hi, I am $name")

  //multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")

}
