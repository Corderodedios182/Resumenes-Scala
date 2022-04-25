package lecturePart1basic

object Expressions extends App {

  // + , - , * , / , & , | , ^ , >> , << , >>>
  var x = 10/2
  println(scala.math.pow(x,2))

  x = x + 2
  println(x >> 1)

  //== , != , > , < , <=
  println(x == 3)

  // ! , && , ||
  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Introducions (Do) vs Expressions (Value)
  //Instruccion significa hacer algo
  //Expresión significa darme un valor
  //En Scala TODO es una expresion
  val aCondition = true
  val aConditionValue = if (aCondition) 5 else 3 //If expression
  println(aConditionValue)
  println(if(aCondition) 5 else 3)

  //Never write this again
  var i = 0
  while (i < 10){
    println(i)
    i+= 1
  }

  //Everything in Scala is an Expression!
  val aWeirdValue = (aVariable = 3)
  println(aWeirdValue)

  //Code blocks : Tipo especial de expressiones
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    println(if (z > 2) "Hello" else "goodbye")

  }
}
