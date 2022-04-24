package lecturePart1basic

object ValuesVariableTypes extends App {

  //Variables Inmutables : can´t be reassigned

  val aString: String = "Hola Mundo!"
  println("Soy un String : " + aString)

  val anoterString = "Good Bay"
  println("Soy un string sin espeficicar : " + anoterString)

  val aBoolean: Boolean = false
  println("Soy un Boleeano : " + aBoolean)

  val aInt: Int = 10
  println("Soy un Int : " + aInt)

  val aFloat: Float = 24.3f
  println("Soy un Flotante : ", aFloat)

  val aDouble: Double = 20.344
  println("Soy un Double : " + aDouble)

  val aShort: Short = 4562
  println("Soy un Short : " + aShort)

  val aLong: Long = 2341
  println("Soy una Long : " + aLong)

  //Variable Mutables : Can be reassigned
  var x : Int = 2
  println(x)
  println(x+1)
  println(x*3)

}




