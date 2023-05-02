package lectures.part1basics

object DefaultArgs extends  App {

  def tailFact(n: Int,acc: Int = 1): BigInt =
    if(n<1) acc
    else tailFact(n-1, n*acc)

  val fact = tailFact(10,acc = 1000)
  println(fact)
}
