package lecturePart1basic

object Functions extends App {

  //
  def aFunction(a : String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("Hello", 3))

  //
  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  //
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + "," + aRepeatedFunction(aString, n - 1)
  }
  println(aRepeatedFunction("Hello",n = 3))

  //
  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  //
  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n,n-1)
  }
  println(aBigFunction(10))

  //Funcion saludo
  def greetins(name: String, age : Int): String = {
    "hola, tu nombre es : " + name + " tienes : " + age
  }
  println(greetins("Carlos", 20))

  //Funcion factorial
  def factorial(n : Int): Int = {
    if (n <= 0) 1 //Recursividad
    else n * factorial(n-1)
  }
  println(" Factorial : " + factorial(7))

  //Fibonacci
  def fibonacciOne(n: Int): Int = {
    if (n <= 2) 1 //Recursividad
    else fibonacciOne(n-1) + fibonacciOne(n-2)
  }
  println("fibonacciOne : " + fibonacciOne(15))

  def fibonacciTwo(n: Long): Long = n match {
    case 0|1 => n //Recursividad
    case _ => fibonacciTwo(n-1) + fibonacciTwo(n-2)
  }
  println("fibonacciTwo : " + fibonacciTwo(15))

  //Si un número es primo o no
  def isPrime(n : Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n/2)
  }
  println("¿Es Primo? : ", isPrime(37))
  println("¿Es Primo? : ", isPrime(2003))
  println("¿Es Primo? : ", isPrime(37 * 17))
}
