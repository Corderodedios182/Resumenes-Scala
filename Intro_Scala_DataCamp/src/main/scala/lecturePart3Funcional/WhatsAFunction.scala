package lecturePart3Funcional

object WhatsAFunction extends App {

  val doubler = new MyFunction[Int, Int] {
    override def apply(element:Int): Int = element * 2
  }

  println(doubler(2))

  // funciones de tipo = Function[A,B]
  val strintToIntConverter = new Function[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(strintToIntConverter("1000" + 145))

  val adder: ((Int,Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(a: Int, b:Int): Int = a + b
  }

}

trait MyFunction[A,B] {
  def apply(elemnt: A):B
}
