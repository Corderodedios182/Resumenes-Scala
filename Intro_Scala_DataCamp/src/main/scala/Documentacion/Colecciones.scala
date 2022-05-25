package Documentacion
import scala.collection.mutable.ArrayBuffer

object Colecciones extends App {

  //Definicion
  val ints = ArrayBuffer[Int]()
  val names = ArrayBuffer[String]("a","b","c","d")
  val nums = ArrayBuffer(1,2,3)

  //Agregar o quitar elementos
  ints += 1
  ints += 0 += 50
  ints ++= nums
  ints ++= List(10,20,30,40)
  println(ints)

  ints -=10
  ints -=10 -= 1
  ints --= nums
  println(ints)

  //metodos
  ints.append(100)
  ints.appendAll(Seq(25,29))
  ints.appendAll(nums)
  println(ints)
  ints.clear()

  ints.insert(0,20)
  ints.insertAll(1, Vector(2,9))
  println(ints)

  ints.prepend(100)
  ints.prependAll(Array(0,1,2))
  println(ints)

  //Borra por la posición
  ints.remove(6)
  ints.drop(0)
  ints.dropRightInPlace(1)
  println(ints)

}
