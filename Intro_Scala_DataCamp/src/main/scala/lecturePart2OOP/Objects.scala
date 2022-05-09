package lecturePart2OOP

//Scala no tienen valores o métodos estáticos

//Objetos Scala
//Un unico Object que ya está instanciado
//Para crear una funcionalidad de nivel de clase, si escalamos es mejor usar Objetos Scala
//están en su propia clase
//son la única instancia
//patrón singleton en una línea

//Compañeros Scala
//pueden acceder a los miembros privados de cada uno
//Scala es más OO que Java

//Aplicaciones Scala

object Objects extends App {

  //El uso de extends APP extiende el metodo => def main(args: Array[String]): Unit

  //Scala no tiene funcionalidad a nivel de clase (static)
  object Person { //tipo + su única instancia
    //"static"/"class" - funcionalidad de nivel
    val N_EYES = 2
    def canFly: Boolean = false

    //Metodo de Fabrica, Consturye nuevas Personas
    def apply(mother: Person, father: Person): Person = new Person("Boobie")
  }
  class Person(val name: String) {
    //Instancia de funcionalidad de nivel
  }
  //Compañeros

  println(Person.N_EYES)
  println(Person.canFly)

  //Scala object = SINGLETON INSTANCE
  val mary = Person //Instanciando un Objeto
  val john = Person
  println(mary == john) //Serán iguales por que vienen del mismo Objeto

  val marys = new Person("marys") //Instanciando una Clase
  val johns = new Person("johns") //Aunque vengan de la misma clase son diferentes instancias
  println(marys == johns)

  val boobie = Person.apply(marys,johns)
  println(boobie)

}
