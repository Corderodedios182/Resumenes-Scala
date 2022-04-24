package lecturePart1basic

object Functions extends App {

  def aFunction(a : String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("Hello", 3))

}
