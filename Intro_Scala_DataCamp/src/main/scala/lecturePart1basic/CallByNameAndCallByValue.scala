package lecturePart1basic

object CallByNameAndCallByValue extends App {

  //SOLO SE EJECUTA UNA VEZ LA FUNCIÓN Y EL VALOR ES EL MISMO.
  //La estrategia de llamada por valor tiene la ventaja de que evalúa cada argumento de función solo una vez.
  def calledByValue(x: Long): Unit = {
    println("By value : " + x )
    println("By value : " + x )
  }

  //lAS FUNCIONES SE EJECUTAN TOD EL TIEMPO.
  //Para hacer un argumento llamado por su nombre, simplemente anteponemos => (símbolo de cohete) a su tipo.

  //La evaluación de llamada por nombre es similar a la llamada por valor, pero tiene la ventaja de que el argumento de una función no se evaluará hasta que se use el valor correspondiente dentro del cuerpo de la función.

    //Ambas estrategias se reducen al valor final siempre que:

    //La expresión reducida consta de funciones puras
  //Ambas evaluaciones terminan

  def calledByName(x: => Long): Unit = {
    println("By Name : " + x )
    println("By Name : " + x )
  }

  println(calledByValue(System.nanoTime())) //Solo va a ejecutar una sola vez la función y así va a guardar su valor
  println(calledByName(System.nanoTime())) //Actualizará el resultado en System.nanoTime() en cada línea.

}
