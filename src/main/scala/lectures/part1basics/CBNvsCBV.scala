package lectures.part1basics

object CBNvsCBV extends App {

  def callByValue(x: Long): Unit = {
    println("by value: "+ x)
    println("by value: "+ x)
  }

  def callByName(x: => Long): Unit = {
    println("by name: "+ x)
    println("by name: "+x)
  }

//  callByValue(System.nanoTime())
//  callByName(System.nanoTime())

  def infinite(): Int = 1 + infinite()
  def printFirst(x: Int, y: => Int) = println(x)

  printFirst(1,infinite())

}



































































































































