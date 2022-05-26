package lecturePart1basic

import scala.annotation.tailrec

object Recursion extends App {

  def sumatoria(n: Int): Int = {
    if (n == 1) 1
    else {
      println(n)
      val result = n + sumatoria(n - 1)
      result
    }
  }
  println(sumatoria(3))

  //@tailrec //Este decorador testea el desbordamiento de pila en una función y nos dará un error si no es Recursiva.
  def factorial(n: Int): Int = {
    """Recursividad con desbordamiento de pila"""
    if (n <= 1) 1
    else {
      println("Computin factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n )

      result
    }
  }
  println(factorial(5))
  //println(factorial(500)) //Desbordamiento de Pila : Limite de ejecuciones para un proceso recursivo o iterativo.

  //Recursividad sin desbordamiento si el decorador @tailred no arroja error.
  def anotherFactorial(n: Int): BigInt = {
    """Funcion Recursiva sin desbordamiento de Pila"""
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n ,1)
  }
  println(anotherFactorial(5000))

  @tailrec
  def strcon(aString: String, n: Int, accumulator: String): String = {
    """Concatena n veces un caracter"""
    if (n <= 0) accumulator
    else strcon(aString, n - 1, n + aString + " - " + accumulator)
  }
  println(strcon("Recursividad", n = 5, ""))

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

    isPrimeTailrec(n / 2, true)
  }
  println("Es primo : " + isPrime(2003))

  def fibonacci(n: Int): Int = {
    def fiboTailrec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n) last
      else fiboTailrec(i + 1, last + nextToLast, last)

    if (n <= 2) 1
    else fiboTailrec(2,1,1)
  }
  println(fibonacci(8))

}
