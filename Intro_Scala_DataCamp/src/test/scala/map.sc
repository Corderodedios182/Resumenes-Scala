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


