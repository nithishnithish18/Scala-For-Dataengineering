package lectures.part2oops

object OOBasics extends App {

  val person  = new Person("john",24)
  println(person.x)
  person.greet("nitheesh")
  person.greet()
//  val person = Person()
//  println(person.name)
//  println(person.age)


}

//class parameters cannot be accessed directly
//class parameters are not class members(fields)
//add val to the class parameter to access the variables

class Person (val name: String, val age: Int)//constructor
{
  //class body
  //member
  val x = 2

  //method
  def greet(name: String): Unit = println(s"${this.name} says: Hi,$name")

  //method overloading
  def greet(): Unit = println(s"Hi,i am ${this.name}")

  //multiple constructors
  def this(name: String) = this(name,0)
  def this() = this("default_name",1)
}




