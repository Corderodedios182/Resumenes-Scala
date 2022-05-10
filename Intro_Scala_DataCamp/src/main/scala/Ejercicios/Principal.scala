package Ejercicios

object Principal extends App {

  //Objeto = Instancia de una clase
  val cuentabancaria = new CuentaBancaria()
  val cuentaBancariaTwo = new CuentaBancaria()

  cuentabancaria.cbu = "1046"
  cuentabancaria.alias = "CRFL"
  cuentabancaria.saldo = 10000

  //Comportamiento de un Objeto : Operaciones que puede realizar a través de sus métodos.
  println(cuentabancaria.mostrarDatos())
  println(cuentabancaria.obtenerSaldo())
  println(cuentabancaria.depositar(1000))
  println(cuentabancaria.retiroDinero(6000))

  //Estado de Un Objeto : Conjunto de valores de sus atributos en determinado instante
  cuentabancaria.cbu = "1820"
  cuentabancaria.alias = "BRFL"
  cuentabancaria.saldo = 30000
  println(cuentabancaria.mostrarDatos())

  //Identidad de un Objeto : Propidad que permite distinguirlo de otros.
  //Generalmente se trata del espacio que ocupa en la memria.
  println(cuentabancaria == cuentaBancariaTwo)

  //Encapsulamiento :
  //La encapsulación es un mecanismo que consiste en organizar datos y métodos de
  //una estructura, conciliando el modo en que el objeto se implementa, es decir,
  //evitando el acceso a datos por cualquier otro medio distinto a los especificados.
  //Por lo tanto, la encapsulación garantiza la integridad de los datos que contiene un objeto.
  val persona = new Persona()
  val empresa = new Empresa()

  val domicilio = new Domicilio()

}



