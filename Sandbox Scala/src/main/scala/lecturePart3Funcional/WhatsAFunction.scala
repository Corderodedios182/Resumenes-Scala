package lecturePart3Funcional

//Queremos poder pasar funciones como parámetros o devolver funciones como resultados.

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

  //Funciones de tipo Function2[A,B,R] === (A,B) => R

  def concatenator: (String, String) => String = new Function2[String,String,String] {
    override def apply(a: String, b: String): String = a + " - " +  b
  }

  println(concatenator("Carlo","Flores"))

  //Función que devuelve una función.
  val supperAdder: Function1[Int, Function1[Int, Int]] = new Function[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }


  val adder3 = supperAdder(3)
  println(adder3(4))
  println(supperAdder(3)(4)) //funciones curried, tienen la propiedad que pueden llamarse con múltiples listas de parámetros simplemente por su mera definición.

}

trait MyFunction[A,B] {
  def apply(elemnt: A):B
}
