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
