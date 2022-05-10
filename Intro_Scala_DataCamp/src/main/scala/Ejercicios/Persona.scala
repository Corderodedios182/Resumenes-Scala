package Ejercicios

case class Persona() {

  var dni: String = ""
  var nombre: String = ""

  def nombreCompleto(): Unit = {
    println(s"Hola $nombre tu dni es $dni")
  }

}
