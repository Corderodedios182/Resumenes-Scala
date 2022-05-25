package Documentacion
import scala.collection.mutable.ArrayBuffer

object Collections extends App {

  //La matriz en Scala es homogénea y mutable , es decir, contiene elementos del mismo tipo de datos y sus elementos pueden cambiar, pero el tamaño de la matriz no puede cambiar.
  //Para crear una secuencia indexada mutable cuyo tamaño puede cambiar se utiliza la clase ArrayBuffer .

  //Definicion
  val arrayOne = ArrayBuffer[Int]()
  val arrayTwo = ArrayBuffer(10,20,30)
  val arrayCharacter = ArrayBuffer[String]("a","b","c","d")

  println("Agregar o quitar elementos")
  arrayOne += 40
  arrayOne += 50 += 60
  arrayOne ++= arrayTwo
  arrayOne ++= List(10,20,30)
  println(arrayOne)
  arrayOne -=10
  arrayOne -=10 -= 20
  arrayOne --= arrayTwo
  println(arrayOne)

  println("Acceso elementos")
  println(arrayOne(2))

  println("Metodos Array")

  println(arrayOne.append(40,50,60))
  println(arrayOne.appendAll(Seq(70,80)))
  println(arrayOne.appendAll(arrayTwo))
  println(arrayOne)
  arrayOne.clear()

  println(arrayOne.insert(0,20))
  println(arrayOne.insertAll(1, Vector(2,9)))

  println(arrayOne.prepend(100))
    println(arrayOne.prependAll(Array(0,1,2)))
  println(arrayOne)

  //Borra por la posición
  arrayOne.remove(6)
  arrayOne.drop(0)
  arrayOne.dropRightInPlace(1)
  println(arrayOne)

  //Iteración sobre los elementos
  for (i <- arrayCharacter)(println(i))

}

object Listas extends App {

  //Específico de Scala ,
  //Colección que contiene datos immutables, lo que significa que una vez que se crea la lista, no se puede modificar.
  //La lista representa una lista enlazada.
  //Debido a la inmutabilidad, no se puede agregar nuevos elementos.
  //Se crea una nueva lista anteponiendo o agregando elementos a un archivo List.

  //Sugerencias :
  // 1 . Anteponer una Lista es un proceso lento es mejor usar un Vector.
  // 2 . No intentar acceder a los elementos de la listas grandes por su valor de índice, en su lugar usar Vector y ArrayBuffer.
  // 3 . Para usar la notación +: , :+ necesitamos tener en mente que el caracter : indica el lado de la secuencia.

  val listaOne = List(1,2,3)
  val listaTwo = 10 +: listaOne
  val listaTree = listaOne :++ List(10,20,30)

  println(listaOne)
  println(listaTwo)
  println(listaTree)

  //También se puede
  //val listaOne: List[Int] = List(1,2,3)
  //val name: List[String] = List("A","b","C")
  //val listaOne = 1 :: 2 :: 3 :: Nil

  println("Metodos")
  println(listaOne.head)
  println(listaOne.tail)
  println(listaOne.isEmpty)
  println(listaOne.reverse)
  println(listaOne.concat(listaTree)) //Concat
  println(listaOne ::: listaTree) //Concat
  println((listaOne).:::(listaTree)) //Concat

  println(List.fill(1)(listaTree)) //Copia una lista

  println("Iteración")
  for (i <- listaOne) println(i)

  println("Operaciones Aritmeticas")
  println(listaOne)
  println(listaTree)
  println((listaOne,listaOne).zipped.map(_ + _))
  println((listaOne,listaOne, listaOne).zipped.map(_ + _ + _))
  //println((listaOne,listaOne, listaOne).transpose.map(_.sum))
  println((listaOne,listaOne).zipped.map(_ - _))
  println((listaOne,listaOne).zipped.map(_ * _))
  println((listaOne,listaOne).zipped.map(_ / _))
  println((listaOne,listaOne).zipped.map(_ % _))

}