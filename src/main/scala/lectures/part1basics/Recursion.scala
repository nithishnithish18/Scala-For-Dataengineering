package lectures.part1basics

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends  App {

  def factorial(n: Int): BigInt = {
    if (n <= 1) 1
    else {
      println("Computig factorial of " + n + " - I first need fact of " + (n - 1))
      val result = n * factorial(n - 1)
      println("compute factorial of" + n)
      return result
    }
  }

//anotherFactorial  - Tail recursive fucntion uses last expression as mid state instead of maintaining many stacks
  def anotherRecursion(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if(x <= 1) accumulator
      else{
        println("Computing factorial of " + x + " - I first need fact of " + (x - 1)+ "and accumulator is "+accumulator)
        factHelper(x-1, x * accumulator) // TAIL recursion use recursive call as the last expression
      }
    }
    factHelper(n,1)
  }
//  println(anotherRecursion(10))

/*
Tail Recursion Exercise
1. Concatenate a string n times
*/

def concatTailrec(aString: String,n: Int, accumulator: String): String =
  if(n <= 0) accumulator
  else concatTailrec(aString, n-1, aString + accumulator)

println(concatTailrec("hello",3,""))

//2. Prime number

def isPrime(n: Int): Boolean = {
  def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
    if (!isStillPrime) false
    else if (t <= 1) true
    else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)

  isPrimeTailrec(n / 2, true)
}
//println(isPrime(2003))

//3. Fibonacci -- hard to follow







}














