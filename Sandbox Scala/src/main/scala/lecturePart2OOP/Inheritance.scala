package lecturePart2OOP

object Inheritance extends App {

  // Herencia clase simple
  //final class Animal
  //sealed class Animal
  class Animal {
    val creatureType = "wild"
    def eat = println("crunch") //Método público para heredar.

    protected def fly: Unit = println("Vuela") //Metodo privado no disponible en otras clases.
  }

  //Se heredan los métodos de la clase animal.
  class Cat extends Animal {
    def crunch = {
      //métodos eat y fly se heredan de Animal, uno es público lo que implica se pueden llamar fuera de la clase y
      //el otro método es privado solo puede heredarse y usarse dentro de la subclase.
      println(s" $eat , 1 . crunch crunch")
      fly //Se puede usar dentro de las Clases pero no fuera de está.
    }
  }

  val cat = new Cat

  println(cat.crunch) //Métods públicos
  println(cat.eat)
  //cat.fly método //Método privado, fly bloqueado con proteced no es accesible fuera de la subclase


  // Constructor actúan de una manera muy particular cuando se trata de herencia.
  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0) //Nos permite instanciar la clase sin algun parametro
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  //Overriding : Anulando métodos de una clase.

  class Dog(dogType: String) extends Animal {
    override val creatureType = dogType //Anulamos atributo heredado de la clase animal.
    override def eat = println("CRUNCH CRUNCH") //Anulamos el método heredado eat de la clase animal.
  }
  val dog = new Dog("K0")
  dog.eat
  println(dog.creatureType)

  //Sustitución de Tipo: Polymorfismo.
  val unknowAnimal: Animal = new Dog("K9")
  unknowAnimal.eat

  // Overriding vs OberLoading

  // super

  // previniendo anulaciones
  //1. usar final en miembro (final)
  //2. usar final en toda la clase
  //3. selle (sealed) la clase = extienda las clases en ESTE ARCHIVO, impida la extensión en otros archivos.


}
