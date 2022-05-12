package Ejercicios

//Clase : Molde o Plantilla que permite la creación de objetos de determinado tipo.

case class CuentaBancaria(        var cbu   : String, //Constructor de la Clase
                          private var alias : String,
                                  var moneda: String,
                                  var tipo  : String) {

  //atributo publico : Se puede usar o modificar fuera de la Clase
  var saldo: Double = 0

  //Metodos
  def mostrarDatos(): String = {
    return "Datos de la Cuenta cbu : " + cbu + " alias : " + alias + " saldo : " + saldo
  }

  //this : con this.alias usamos el atributo general de la Clase y sin el this usamos el alias del método.
  def setAlias(alias: String): Unit = {
    if (alias != null) this.alias = alias
    else "null"
  }

  def setMoneda(moneda: String): Unit = {
    if (moneda != null)
      this.moneda = moneda
  }

  def setTipo(tipo: String): Unit = {
    if (tipo != null)
      this.tipo = tipo
  }

  def getSaldo(): String = {
    return "Tu Saldo es : " +  saldo
  }

  def getAlias(): String = {
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


