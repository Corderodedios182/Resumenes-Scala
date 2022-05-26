package lecturePart3Funcional

object Principal extends App {

  //Pura : Siempre regresa un mismo valor.
  def pure(x: Int, y:Int): Int = x + y

  val pura = pure(1,1)
  println(pura)

  //Impura: El valor de salida cambia.
  var acc: Int = 0
  def impure(x: Int, y:Int): Int = {
    acc += 1
    x + y + acc
  }

  println(impure(1,1))
  println(impure(1,1))

  //Tipos Algebraicos de datos.
  sealed trait IList {
    def prepend(h: Int): IList = new Cons(h, this)
    def sum: Int = this match {
      case End() => 0
      case Cons(h,t) => h + t.sum
    }
    def map(f: Function1[Int, Int]): IList = this match {
      case End() => End()
      case Cons(h, t) => Cons(f(h), t.map(f))
    }
  }
  case class End() extends IList
  case class  Cons(head: Int, tail: IList) extends IList

  val xs: IList = Cons(1, Cons(2, Cons(3, End())))
  xs.prepend(0) //IList(0,1,2)
  println(xs)

  println("Suma : " ,Cons(1,Cons(2, Cons(3,End()))).sum)

  //Case classes
  case class Bicicleta(cadencia: Int, marcha: Int, velocidad:Int)

  new Bicicleta(1,2,3)
  Bicicleta(1,2,3)
  val b = Bicicleta(1,2,3)
  b.cadencia
  b.marcha
  b.velocidad

  b.copy(velocidad = 4)

  //Pattern Matching
  def myPm(x:Any): Int = x match {
    case i: Int => i
    case s: String => s.length
    case _ => -1
  }

  println(myPm(5))
  println(myPm("Dos"))
  println(myPm(3.4))

  //Expresiones Lambda
  def incr(x: Int): Int = x + 1
  incr(0)

  val x: Int = 0
  val s: String = "Hola"
  val f: Function1[Int, Int] = new Function1[Int, Int] {
    def apply(x: Int): Int = x + 1
  }

  println("Expresion Lambda : ", f.apply(0))

  //Azucar Sintáctico




}