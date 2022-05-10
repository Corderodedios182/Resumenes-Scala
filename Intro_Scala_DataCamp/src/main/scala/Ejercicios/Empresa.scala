package Ejercicios

case class Empresa() {

  var razonSocial: String = ""
  var cuit: String = ""

  def contratar(): Unit = {
    println(s"Bienvenido a $razonSocial")
  }

  def pagarSalarios(): Unit = {
    println("Salarios Competitivos")
  }

}
