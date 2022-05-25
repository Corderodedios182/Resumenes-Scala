package lecturePart2OOP

//Las enumeraciones son una herramienta útil para crear grupos de constantes,
//como días de la semana, meses del año y muchas otras situaciones en las que tiene un grupo de valores constantes relacionados.

object Enums extends Enumeration {
    type Margin = Value
    val TOP, BOTTOM, LEFT, RIGHT = Value
}

object Main extends App {

  // use an enumeration value in a test
  var currentMargin = TOP

  // later in the code ...
  if (currentMargin == TOP) println("working on Top")

  // print all the enumeration values
  Enums.values foreach println

}

sealed trait Margin
case object TOP extends Margin
case object RIGHT extends Margin
case object BOTTOM extends Margin
case object LEFT extends Margin