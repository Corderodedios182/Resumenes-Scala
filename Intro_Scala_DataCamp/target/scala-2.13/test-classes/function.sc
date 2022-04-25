val kingSpades: Int = 10
val tenHears: Int = 10

def bust(hand : Int): Boolean = {
  hand > 21
}

bust(kingSpades + tenHears)