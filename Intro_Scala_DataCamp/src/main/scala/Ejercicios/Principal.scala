package Ejercicios

object Principal extends App {

  //Objeto = Instancia de una clase
  val cuentabancaria = new CuentaBancaria("CRFL", "Carlos", moneda = "$", tipo = "moneda")
  val cuentaBancariaTwo = new CuentaBancaria("BRFL", "Bernardo", moneda = "$", tipo = "moneda")
  val cuentaBancariaTree = new CuentaBancaria()

  //Atributos privados deben ser actualizado o llamados por un método.
  println(s"Soy atributo privado " + cuentabancaria.getAlias())

  println(s"Me actualizaron " + cuentabancaria.setAlias("TRFL"))
  println(s"Actualización de Alias " + cuentabancaria.getAlias())

  //Atributo Publico, se puede consultar y modificar fuera de la Clase
  println(s"Soy atributo publico " + cuentabancaria.cbu)
  cuentabancaria.saldo = 10000

  //Comportamiento de un Objeto : Operaciones que puede realizar a través de sus métodos.
  println(cuentabancaria.mostrarDatos())
  println(cuentabancaria.getSaldo())
  println(cuentabancaria.depositar(1000))
  println(cuentabancaria.retiroDinero(6000))

  //Estado de Un Objeto : Conjunto de valores de sus atributos en determinado instante

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

  println(cuentaBancariaTree.mostrarDatos())

  println(cuentabancaria.toString())

  //Atributos de tipo Objeto
  val motorOne = new Motor(1,4,"diesel")

  val gol = new Auto("dos", "VW", 175000, "negro", motorOne)

  println(gol.toString)

  motorOne.setcilindrada(3)

  println(gol.toString)
  println(gol.elMotor.potencia)
  println(gol.elMotor.setcilindrada(1))

  println(motorOne.toString)

}
