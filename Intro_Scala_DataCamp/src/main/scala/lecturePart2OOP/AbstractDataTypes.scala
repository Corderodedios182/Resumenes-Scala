package lecturePart2OOP

//Traits vs Clases abstractas.
//1. traits no tienen parametros constructores.
//2. multiples traits pueden heredarse .
//3. Elegimos un trait frente a una clase si describe su comportamiento.

//Los traits se utilizan para compartir interfaces y campos entre clases.
//Son similares a las interfaces de Java 8.
//Las clases y los objetos pueden extender las características, pero las características no se pueden instanciar y, por lo tanto, no tienen parámetros.

object AbstractDataTypes extends App {

  //Clase abstracta : Una clase abstracta puede considerarse como un modelo para otras clases.
  //Le permite crear un conjunto de métodos que deben crearse dentro de cualquier clase secundaria creada a partir de la clase abstracta.

  //Definimos el método eat como referencia para otras clases.
  abstract class Animal {
    val creatureType: String
    def eat: Unit

  }

  //Se define el método eat con una acción.
  class Dog extends Animal {
    override val creatureType: String = "Canino"
    def eat: Unit = println("crunch crunch")
  }

  //Traits :
  trait Carnivoro {
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait SangreFria

  class Cocodrilo extends Animal with Carnivoro with SangreFria {
    val creatureType: String = "croc"
    def eat: Unit = println("nomnomnnom")
    def eat(animal: Animal): Unit = println(s"I´m a croc and I´m eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Cocodrilo
  croc.eat(dog)

}
