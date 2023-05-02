package lectures.part2oops
import scala.language.postfixOps
object MethodNotation extends App{

  class Person(val name: String, favoriteMovie: String) {
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"${name}, what the heck"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and i like $favoriteMovie"

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
}
