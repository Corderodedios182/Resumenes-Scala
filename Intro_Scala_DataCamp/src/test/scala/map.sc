
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


