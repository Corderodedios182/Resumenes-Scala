package lecturePart2OOP

//Profundizar

//Scala provee soporte nativo para clases parametrizados con tipos.
//Eso es llamado clases genéricas y son especialmente importantes para el desarrollo de clases tipo colección.

//A continuación se muestra un ejemplo:

class Stack[T] {
  var elems: List[T] = Nil
  def push(x: T): Unit =
    elems = x :: elems
  def top: T = elems.head
  def pop() { elems = elems.tail }
}

object GenericsTest extends App {
  val stack = new Stack[Int]
  stack.push('a')
  println(stack.top)
  stack.push('z')
  println(stack.top)
  stack.push(1)
  println(stack.top)
}

object Generics extends App {

  class MyList[+A]{
    //Permite definir cualquier tipo de dato.
    def add[B >: A](element: B): MyList[B]
  }

  class MyMap[Key, Value]

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //Métodos génericos
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  //Problema de la Varianza
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  //1. Si, List[Cat] extends List[Animal] = COVARIANCE
  class CovarianList[+A]
  val animal: Animal = new Cat
  val animalList: CovarianList[Animal] = new CovarianList[Cat]

  //2. No = INVARIANZA
  class InvarianList[A]
  val invariantAnimalList: InvarianList[Animal] = new InvarianList[Animal]

  //3. Hell, no! Contravarianza
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //bounded type
  class Cage[A >: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  val newCage = new Cage(new Car)

}
