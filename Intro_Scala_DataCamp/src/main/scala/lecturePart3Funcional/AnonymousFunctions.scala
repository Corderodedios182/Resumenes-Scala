package lecturePart3Funcional

object AnonymousFunctions extends App {

  val double = new Function[Int, Int] {
    override def apply(x: Int) = x * 2
  }

  //anonymous function (Lambda)
  val doubler = (x: Int) => x * 2

  //multiples parametros en Lambda
  val adder: (Int, Int) => Int = (a:Int, b:Int) => a + b

  //Sin parametros
  val justDoSomething: () => Int = () => 3

  //carrefull
  println(justDoSomething) //funciones itself
  println(justDoSomething()) //call

  //curly braces with lambdas
  val stringToInt = { (str: String) =>
    str.toInt
  }

  //Más de azúcar sintáctico.
  val niceIncrementer: Int => Int = _ + 1 //Equivalente x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _

}
