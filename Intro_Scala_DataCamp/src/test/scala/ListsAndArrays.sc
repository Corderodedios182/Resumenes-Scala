// Define a function to determine if hand busts
def bust(hand: Int): Boolean = {
  hand > 21
}

//Array
val players = Array("Alex", "Chen", "Marta")
players(0) //Select array
players(0) = "Charly" //Replace array
players

val players_null = new Array[String](3) //Especificando un solo tipo de datos
players_null(0) = "A"
players_null(1) = "B"
players_null(2) = "C"
players_null

val mixedTypes = new Array[Any](3) //Con Any cualquier tipo de dato
mixedTypes(0) = 1
mixedTypes(1) = "Charly"
mixedTypes(2) = 29.0
mixedTypes

//List
val players_list = List("Alex", "Chen", "Marta")
//List has methods
players_list.length
players_list.reverse
players_list.drop(2)

val newPlayers = "Sindhu" :: players_list //Con :: podemos agregar elementos
newPlayers

val players_listwo = "Alex" :: "Chen" :: "Marta" :: Nil //Creacion vacia con Nil y ::
players_listwo

players_list ::: players_listwo //Concatenado de listas
