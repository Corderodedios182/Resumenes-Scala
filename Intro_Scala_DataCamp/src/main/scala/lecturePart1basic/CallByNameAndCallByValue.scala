package lecturePart1basic

object CallByNameAndCallByValue extends App {

  //** Código por valor :
  // - El valor se calcula antes de llama a la función.
  // - El mismo valor se usa en toda la función, no importa cuántas veces se use el parámetro x en la función siempre será el mismo.

  def myFunction(x: Int): Unit = { println(x) }

  val y = myFunction(2)

  //SOLO SE EJECUTA UNA VEZ LA FUNCIÓN Y EL VALOR ES EL MISMO.
  //La estrategia de llamada por valor tiene la ventaja de que evalúa cada argumento de función solo una vez.
  def calledByValue(x: Long): Unit = {
    println("By value : " + x )
    println("By value : " + x )
  }

  def infinite(): Int = 1 + infinite()

  //** Código por nombre :
  // - El valor pasa por nombre la expresión se pasa como está.
  // - Se evalua siempre en la función

  def myFunctionOne(x: => Int): Unit = {println(x)}

  val y1 = myFunctionOne(2)

  //lAS FUNCIONES SE EJECUTAN TOD EL TIEMPO.
  def calledByName(x: => Long): Unit = {
    println("By Name : " + x )
    println("By Name : " + x )
  }

  println(calledByValue(System.nanoTime())) //Solo va a ejecutar una sola vez la función y así va a guardar su valor
  println(calledByName(System.nanoTime())) //Actualizará el resultado en System.nanoTime() en cada línea.

  def printFirst(x: Int, y: => Int): Unit = { println(x) }

  printFirst(34, infinite())

}
