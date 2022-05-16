package Ejercicios

case class Motor(
                var numero:Int,
                var cilindros: Int,
                var tipo: String) {

  var potencia: String = "Definir Cilindros"

  override def toString(): String = {
    s"Clase Motor con numero : $numero , cilindros $cilindros tipo : $tipo, potencia : $potencia"
  }

  def setcilindrada(cilindros: Int): Unit = {
    if (cilindros >= 2) {
      potencia = "no es un auto"
      println(s"$potencia")
    }
    else
      potencia = "es un auto"
      println(s"$potencia")
  }
}
