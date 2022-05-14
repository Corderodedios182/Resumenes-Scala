package lecturePart3Funcional

object WhatsAFunction extends App {

  val doubler = new MyFunction[Int, Int] {
    override def apply(element:Int): Int = element * 2
  }

  println(doubler(2))

}

trait MyFunction[A,B] {
  def apply(elemnt: A):B
}
