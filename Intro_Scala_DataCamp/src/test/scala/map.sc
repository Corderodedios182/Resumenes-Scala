import scala.collection.mutable
import scala.collection.immutable

val numero = List(2,3,4,5,6,7)
val coches = List("Audi","BMX","Vw")
val sublista = List(numero, numero)

numero.map{ x => 2 * x}

coches.map{_.toLowerCase()}
coches.map{_.length()}

sublista.map {(x: List[Int]) => x.map {n => n *2} }.flatten
sublista.flatMap {(x: List[Int]) => x.map {n => n *2} }

numero.map {x => List(x, x*2)}
numero.flatMap {x => List(x, x*2)}

coches.flatMap { c => c.toUpperCase()}.distinct

//Set

val set = Set(1,2,3,3,3,4,4,5,6,6,6) //No datos duplicados

set.map { x => 2 * x}
set.contains(3)
set(3)

val set2 = set ++ Set(100,200,300,400)
set -- set2

set | set2 //union
set &~ set2 //diferencia
set diff set2

val mset = mutable.Set(1,2,3)
mset += 4
mset ++= set

mset.filter { x => x % 2 == 0}

val sset = immutable.SortedSet(3,2,5,9,3,5)

Ordering.fromLessThan[Int]({ (m, n) => m > n})

val mayorMenor = Ordering.fromLessThan[Int](_ > _)
val sortedSetInverso = immutable.SortedSet.empty(mayorMenor) ++ set

//HassMap, Map
//Python : Diccionario
//Ruby : Hashes

//Tenemos :
//Claces <- A
//Valores <- B
//(Clave, Valor)

val mapa = mutable.Map(1 -> "Pepe",
                      2 -> "Bernardo",
                      3 -> "Carlos" )

val mapa1 = Map(10 -> "Pepe",
                20 -> "Bernardo",
                30 -> "Carlos" )

mapa.keySet
mapa.values
mapa.get(2)
mapa.getOrElse(9, "No existe")
mapa.contains(2)

mapa + (6 -> "Messi")
mapa - 3 //Quitar elemento

mapa ++ mapa1
mapa.put(4, "Yair")

//foreach : Itereción sobre colecciones (for)

val lenguajes = Seq("Java", "Scala", "Kotlin", "Clojure", "Swift", "Rust")
val opiniones = Seq("conciso","moderno","atrevido","anticuado","aburrido", "convertido")

lenguajes.foreach(l => opiniones.foreach(o => s"$l me parece $o"))

for (l <- lenguajes; o <- opiniones) {
  println(s"$l me parece un lenguaje $o")
}

for (l <- lenguajes if l.endsWith("a"); o <- opiniones if o.startsWith("a")){
  println(s"$l me parece $o")
}

