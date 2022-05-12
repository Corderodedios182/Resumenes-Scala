package Ejercicios

//Clase : Molde o Plantilla que permite la creación de objetos de determinado tipo.
//Clase CuentaBancaria
case class CuentaBancaria() {

  //atributos private : Solo se pueden usar dentro de la Clase
  private var cbu: String = ""
  private var alias: String = ""

  //atributo publico : Se puede usar o modificar fuera de la Clase
  var saldo: Double = 0

  //Metodos
  def mostrarDatos(): String = {
    return "Datos de la Cuenta cbu : " + cbu + " alias : " + alias + " saldo : " +saldo
  }

  def establecerAlias(nuevoAlias: String): Unit = {
    if (nuevoAlias != null) alias = nuevoAlias
    else "null"
  }

  def obtenerSaldo(): String = {
    return "Tu Saldo es : " +  saldo
  }

  def obtenerAlias(): String = {
    return "Tu Alias es : " +  alias
  }

  def depositar(monto: Double): Unit = {
    if (monto > 0) {
      saldo = saldo + monto
      println(s"Se depositaron : $monto tu nuevo saldo es : $saldo")
    } else println("No hubo un deposito a favor.")
  }

  def retiroDinero(monto: Double): Unit = {
    if (saldo >= monto) {
      saldo = saldo - monto
      println(s"Retiraste $monto tu nuevo saldo es : $saldo")
    }
  }

}


