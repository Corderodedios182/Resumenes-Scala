package Ejercicios

//Clase : Molde o Plantilla que permite la creación de objetos de determinado tipo.
//Clase CuentaBancaria
case class CuentaBancaria() {

  //atributos
  var cbu: String = ""
  var alias: String = ""
  var saldo: Double = 0

  //Metodos
  def mostrarDatos(): String = {
    return "Datos de la Cuenta cbu : " + cbu + " alias : " + alias + " saldo : " +saldo
  }

  def obtenerSaldo(): String = {
    return "Tu Saldo es : " +  saldo
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


