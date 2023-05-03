package lectures.part2oops
import scala.language.postfixOps
object MethodNotation extends App{

  class Person(val name: String, favoriteMovie: String,val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def +(nickname: String): Person = new Person(s"$name ($nickname)", favoriteMovie)
    def unary_! : String = s"${name}, what the heck"
    def unary_+ : Person = new Person(name,favoriteMovie,age + 1)
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and i like $favoriteMovie"
    def apply(times: Int) = s"${name} watched ${favoriteMovie} ${times} times"

    def learns(thing: String) = s"$name is learning $thing"
    def learnScala = this learns("Scala")

}
  //Infix Notation = Operator Notation
//works only for method with one param
  val marry =new Person("Marry","Inception")
  println(marry.likes("Inception"))
  println(marry likes "Inception")

  //Operators in SCALA
  val tom = new Person("Tom", "Fight Club")
//  println(marry.hangOutWith(tom))
//  println(marry hangOutWith tom )

  println(marry.+(tom))
  println(marry + tom)

  //All Operators ARE Methods in scala
  //AKKA actors have ! ?

//Prefix Notation
val x = -1 //equivalent to 1.unary_-
val y = 1.unary_-
//unary_ prefix only works with - + ~ !

println(!marry)
print(marry.unary_!)


//Postfix Notation
println(marry.isAlive)
println(marry isAlive)

//apply() method in scala
//if instance called with empty parenthesis, compiler by default looks for apply() method in the class
println(marry.apply())
println(marry())//equivalent to marry.apply()

/*
Exercises
*/
//Infix Notation
//1. Overload the + operator
//marry + "the rockstar" => new person "marry (the rockstar)"
println((marry + "the rockstar").apply())

//Prefix Notation
//2.Add age to the Person class
//Add a unary + operator => new person with age + 1
//+marry => marry with the age incrementer
println((+marry).age)

//Postfix Notation
//3.Add a "learns" method in the Person class => "Marry learns scala"
//Add a learnscala method, call the learns method with "Scala"
//Use it in postfix Notation
println(marry learnScala)

//4.Overload the apply method
//marry.apply(2) => "Marry watched Inceptio 2 times"
println(marry(10))

}
