package lecturePart2OOP

object InheritanceAndTraits extends App {

  // Herencia clase simple
  class Animal {
    protected def eat = println("nommon")
  }

  class Cat extends Animal {
    def crunch = {
      eat
      println("crunch crunch")
    }
  }

  val cat = new Cat

  // Constructor
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name, age)

  //Overriding
  //Class Dog (Override val creatureType: Strin) extends Animal {
  //    override val creatureType = "domestic
  //  override def eat = println("crunch, crunch")
  // }

}
