package lectures.part1basics

object expressions extends App{

  val x = 1 + 2
  println(x != 3)
  println(!(1==2))


  var aVariable = 2
  aVariable += 3
  println(aVariable)

  // Instructions vs Expressions
  var i = 0
  val aWhile = while (i < 10){
    println(i)
    i += 1
  }

  val aWeirdValue = (aVariable=1)
  println(aWeirdValue)
  println(aWhile)
// code block
val aCodeBlock = {
  val y = 2
  val z = y+1

  if (z>1) "hello" else "goodbye"

  val someVal = {
    2<3
    1
  }
  println(someVal)

  val someOtherValue = {
  if(true) 12 else 10
    123
  }
println(someOtherValue)
}

//

}
