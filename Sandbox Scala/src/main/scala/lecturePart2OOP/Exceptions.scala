package lecturePart2OOP

object Exceptions extends App {

  def person(age:Int){
    if(age!=15) {
      throw new Exception("No tienes Quince")
    } else println("Tienes quince")
  }

  println("Primer Try")

  try{
    person(15)
  } catch{
    case _:Throwable=>println("An exception occurred")
  }

  println("Segundo Try")

  try{
    person(17)
  } catch{
    case _:Throwable=>println("An exception occurred")
  }

  // - Expresiones Comunes

  //OutOfMemoryError : La JVM se queda sin memoria
  //Crea una matriz que excede el límite de la memoria virtual

  //val array= Array.ofDim(Int.MaxValue)

  // - StackOverflowError
  //El desbordamiento de pila se refiere específicamente al caso en que la pila de ejecución crece más allá de la memoria que está reservada para ella.
  //Por ejemplo, si llama a una función que se llama recursivamente a sí misma sin terminación,
  //causará un desbordamiento de pila ya que cada llamada a función crea un nuevo marco de pila y
  //la pila eventualmente consumirá más memoria de la que está reservada para ella.

  //def infinite: Int = 1 + infinite
  //val noLimit = infinite

  /* Throw Creación de Excepciones
  - OverflowException
  - UnderflowException :
  - MathCalculationException : division por 0
   */

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division por 0 no soportada")

  object PocketCalculator {

    def add(x: Int, y : Int) = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0) throw new OverflowException
      else if (x < 0 && y > 0 && result > 0) throw new UnderflowException
      else result
    }

    def divide(x:Int, y:Int) = {
      if (y == 0) throw new MathCalculationException
      else x / y
    }
  }

  //println(PocketCalculator.add(Int.MaxValue, 10)) //OverflowException
  println(PocketCalculator.divide(10,0))

}
