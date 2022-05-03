package lecturePart2OOP

import lecturePart2OOP.OOBasics.personOne

object OOBasics extends App{

  val personOne = new Personas("Charly", 29)
  val personTwo = new Personas("Tere", age = 62)

  println("1. Tu edad actual es de Instanciado en la Clase como parametro por var age:Int  : " + personOne.age)
  println("2. Tu edad en meses es de :" + personOne.meses)
  println("3. Tu proxima edad es : " + personOne.agetwo)

  personOne.greet("Tere")
  personOne.overloading("Tere")

  println("-------")

  personTwo.todoJunto("Bernardo")

}

class Personas(name: String, var age: Int = 0) { //Constructor : Parametros con los que se debe construir cada instancia de persona.
  //Lo parametros de la clase no son campos, necesitan ser definidos como variables ejemplo : val age: Int = 0
  //Los parametros de la clase y lo campos de la clase son diferentes

  val meses: Int = (age*12) //Valores nuevos en la clase pueden ser usados como campos.

  //body
  val agetwo = age + 1 //Se pueden ocpar como campos

  // Metodos                                    //Con this.name accedemos al parametro instanciado en la Clase
  def greet(name: String): Unit = println(s"4. ${this.name} says : Hi, $name tu edad es $age años vas a cumplir $agetwo tu edad en meses es de : $meses")

  // overloading (Sobrecarga) : Definir metodos con el mismo nombre pero diferentes firmas.
  def overloading(name: String): Unit = println(s"5. Tengo name ${this.name} es el nombre Instanciado en la clase Personas('Charly', 29) y $name es el parametro colocado en el metodo greet() en la clase Persona.")

  //multiples constructores
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")

  def todoJunto(name: String): Unit = {
    println("Todo Junto en un metodo jugando con los parametros de la clase.")
    println(s"1. Tu edad actual es de Instanciado en la Clase como parametro por var age:Int: $age")
    println(s"2. Tu edad en meses es de : $meses ")
    println(s"3. Tu proxima edad es : $agetwo")
    println(s"4. ${this.name} says : Hi, $name tu edad es $age años vas a cumplir $agetwo tu edad en meses es de : $meses")
    println(s"5. Tengo name ${this.name} es el nombre Instanciado en la clase Personas('Charly', 29) y $name es el parametro colocado en el metodo greet() en la clase Persona.")
  }

}

