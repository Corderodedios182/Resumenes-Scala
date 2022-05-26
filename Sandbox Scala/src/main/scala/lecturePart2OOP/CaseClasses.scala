package lecturePart2OOP

object CaseClasses extends App {

  /*
  equals, hasCode, toString
  */

  case class Person(name: String, age: Int)

  //1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.name)

  //2. Sensible toString
  //println(instance) = println(instance.toString) //Sugar syntactica
  println(jim)

  //3. equals and hasCode implemented OOTB
  val jim2 = new  Person("Jim",34)
  println(jim == jim2)

  //4. CCs tiene incluido el metodo copy()
  val jim3 = jim.copy(age = 56)
  println(jim3)

  //5. CCs tiene comparación de objetos
  val thePerson = Person
  val mary = Person("Mary", 23)

  //6. CCs es serializable

  //7. CCs tiene el patron extractor = CCs puede usar Pattern Matchint
  case object UnitedKingdom {
    def name: String = "The UK"
  }

}
