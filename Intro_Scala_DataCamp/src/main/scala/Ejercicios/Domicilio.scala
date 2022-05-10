package Ejercicios

case class Domicilio() {

  var calle: String = ""
  var altura: String = ""
  var barrio: String = ""

  def domicilio(): Unit = {
    println(s"Tu domicilio es $calle y $barrio")
  }

}
