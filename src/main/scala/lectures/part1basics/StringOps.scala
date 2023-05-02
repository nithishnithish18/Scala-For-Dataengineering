package lectures.part1basics

import scala.+:

object StringOps extends  App{

  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("Hello", "Hey"))

  val aNumberStr = "2"
  val aNum = aNumberStr.toInt
  println('a' +: aNumberStr :+ 'z')
  println(str.reverse)
  println(str.take(4))


  //scala-specific string operators
  //s-interpolators

  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and i am ${age+1} years old"
   println(greeting)

  //F-interpolators
  val speed: Float = 1.2f
  val myth = f"$name%s can eat $speed%.3f burgers per minute"
  println(myth)

  //raw interpolator
  val was = "my name is \n nitheesh"
  println(raw"$was")
}
