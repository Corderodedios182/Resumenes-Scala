package lecturePart2OOP

object AnonymousClass extends App {

  abstract class Animal {
    def eat: Unit
  }

  //anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("ahahahahaha")
  }
  /*
  equivale a

  class AnonymousClasses$$anon$l extends Animal {
    override def eat: Unit = println("aahahahahaha")
    }
  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
   */

  println(funnyAnimal.getClass)

  class Person(name: String){
    def sayHi: Unit = println(s"Hi $name")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi Jim")
  }

}
