//Tipos estaticos Scala
//Scala combina programación funcional y orientada a objetos en un lenguaje conciso y de alto nivel.
// Los tipos estáticos de Scala ayudan a evitar errores en aplicaciones complejas,
// y sus tiempos de ejecución de JVM y JavaScript le permiten crear sistemas de alto rendimiento con fácil acceso a enormes ecosistemas de bibliotecas.

//Type: restringe los valores posibles a los que una variable puede hacer referencia, o una expresión puede producir, en tiempo de ejecución
//Compile time: cuando el código fuente se traduce a código de máquina, es decir, código que una computadora puede leer
//Run time de ejecución: cuando el programa está ejecutando comandos (después de la compilación, si está compilado)

//Sistemas de tipo estático
//Un lenguaje se tipifica estáticamente si el tipo de variable se conoce en el momento de la compilación.
//Es decir, los tipos se comprueban antes del tiempo de ejecución.
//C / C++ , Fortran, Java, Scala

//Sistemas de tipos dinámicos
//Un lenguaje se escribe dinámicamente si los tipos se comprueban en el y.
//Es decir, los tipos se comprueban durante la ejecución (es decir, el tiempo de ejecución).
//Javascript, Python, Ruby, R

//Pros Sistemas de tipo estático.
//Mayor rendimiento en tiempo de ejecución
//Propiedades de su programa verificado (es decir, probar la ausencia de errores comunes relacionados con el tipo)
//Refactorizaciones seguras
//Documentación en forma de anotaciones de tipo (: Intinval four Hearts: Int = 4

//Contras de los sistemas de tipos estáticos
//Se necesita tiempo para verificar los tipos (es decir, demora antes de la ejecución)
//El código es detallado (es decir, el código es más largo o más molesto para escribir)
//El lenguaje no es flexible (por ejemplo, una forma estricta de componer un tipo)

//Podemos reducir la especificacion del tipo de dato.
val fourHearts: Int = 4
val fourHearts = 4

val players: Array[String] = Array("Alex", "Chen", "Marta")
val players = Array("Alex", "Chen", "Marta")

//¿Se paso de 21?
def bust(hand : Int): Boolean = {
  hand > 21
}

// Find the number of points that will cause a bust
def pointsToBust(hand: Int): Int = {
  // If the hand is a bust, 0 points remain
  if (bust(hand))
    0
  // Otherwise, calculate the difference between 21 and the current hand
  else
  21 - hand
}

// Test pointsToBust with 10♠ and 5♣ = 15
val myHandPointsToBust = pointsToBust(15)
println(myHandPointsToBust)

