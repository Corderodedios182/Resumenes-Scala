package Ejercicios

//Lista enlazada individualmente, contiene números enteros.

//Scala ofrece herencia basada en clases

//modificadores de acceso: privado, protegido, predeterminado (none = public)
//necesita pasar los argumentos del constructor a la clase principal

//Las clases derivadas pueden anular miembros o métodos
//Reutilizar parent fields / methods with super
//Prevenir la herencia con final and sealed
//Uso de abstract classes
//Uso de traits

//Inheriting from a class and multiple traits

abstract class MyList {

 /*
 Siguientes métodos
  head = primer elemento de la lista
  tail = resto de la lista
  isEmpty = si la lista está vacía
  add(int) => nueva lista con elementos agregados
  toString => anular el método y escribir un string de la representación de la lista
 */
  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(element: Int): MyList
  def printElements: String
  //Polimorfismo
  override def toString: String = "[" + printElements + "]"
}

object Empty extends MyList {

  def head: Int = throw new NoSuchElementException()
  def tail: MyList = throw new NoSuchElementException()
  def isEmpty: Boolean = true
  def add(element: Int): MyList = new Cons(element, Empty)
  def printElements: String = ""
}

class Cons(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(element:Int): MyList = new Cons(element, this)
  def printElements: String =
    if(t.isEmpty) "" + h
    else h + " " + t.printElements

}

object ListTest extends App {
  val list = new Cons(1, new Cons(2, new Cons(3, Empty)))
  println(list.tail.head)
  println(list.add(4).head)
  println(list.isEmpty)

  println(list.toString)
}
