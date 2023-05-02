package lectures.part1basics

object Functions extends  App{

  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("hello",3))
  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
 // println(aParameterlessFunction)

 def aRepeatedFunction(aString: String, n: Int): String = {

   if(n == 1) aString
   else aString + aRepeatedFunction(aString, n-1)
 }

 println(aRepeatedFunction("Nitheesh ",3))

//when you want to implement loops use scala functions
//loops imperative language style that doesn't apply to scala

def aFunctionWithSideEffects(aString: String) =  println(aString)

println(aFunctionWithSideEffects("Miss YOU"))



// AUXILIARY FUNCTION

def aBigFunction(n: Int): Int = {
  def aSmallFunction(a: Int, b:Int): Int = a + b
  aSmallFunction(n, n-1)
}

println(aBigFunction(10))

//Practice questions
// 1. Greet function
def greet(name: String, age: Int): String = {
  "HI my name is "+name+" and i'm "+age+" years old"
}
greet("nitheesh",23)

//2. factorial

def factorial(n: Int): Int = {
  if (n==0) 1
  else n * factorial(n-1)
}
println(factorial(3))

//3.Fibbonaci series
def fibonacciSeries(n: Int): Int = {
  if(n <= 2) 1
  else fibonacciSeries(n-1) + fibonacciSeries(n-2)
}
// 1 1 2 3 5 8
println(fibonacciSeries(5))


//4. is Prime
def isPrime(n: Int): Boolean = {
  def isPrimeUntil(t: Int): Boolean =
    if (t <= 1) true
    else n % t != 0 && isPrimeUntil(t-1)
  isPrimeUntil(n/2)
}
println(isPrime(12))
} 


