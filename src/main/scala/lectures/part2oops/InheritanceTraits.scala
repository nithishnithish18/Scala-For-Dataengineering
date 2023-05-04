package lectures.part2oops

object InheritanceTraits extends App{

sealed class Animal{
  val creatureType = "wild"
  def eat = println("nom nom nom")
}

class Cat extends  Animal {
  def crunch = {
    eat
    println("crunch crunch")
  }
}
val cat = new Cat
cat.crunch


//constructors
class Person(name: String, age: Int){
    def this(name: String) = this(name,0)  //Auxiliary constructor
  }
class Adult(name: String, age: Int, Idcard: String) extends Person(name, age)


//overriding
//superclass members and methods using override keyword
class Dog(dogType: String) extends Animal{
    override val creatureType: String = dogType
    override def eat = {
      super.eat
      println("crunch, crunch")
    }
  }
  val dog = new Dog("domestic")
  dog.eat
  println(dog.creatureType)


  //type substitution
  val unknownAnimal: Animal = new Dog("key9")
  println("polymorphism example")
  unknownAnimal.eat

  //overriding and overloading

  //Super - to access superclass members/method from base class

  //Preventing overrides
  // 1- using "final" keyword
  // 2- Using "final" on the entire class
  // 3- "sealed" the class = extend class in this file and prevent extention in other files
}
