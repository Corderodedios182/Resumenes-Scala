package lecturePart3Funcional

class Dog extends Speaker with TailWagger with Runner {

  // Speaker
  def speak(): String = "Woof!"

  // TailWagger
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")

  // Runner
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")

}

//Extienden los metodos en una clase.
trait Speaker {
  def speak(): String
}

trait TailWagger {
  def startTail(): Unit
  def stopTail(): Unit
}

trait Runner {
  def startRunning(): Unit
  def stopRunning(): Unit
}

object DogOne extends App {
  val d = new Dog
  d.startTail()
  d.stopTail()
}
