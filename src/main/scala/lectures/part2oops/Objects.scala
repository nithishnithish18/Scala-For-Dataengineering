package lectures.part2oops

object Objects  {

  object Person{ //type + its only instance
    //static- class - level functionality
    val N_EYES  = 2
    def canFly: Boolean = false

    def apply(mother: Person, father: Person): Person = new Person("Bobbie")

  }

  class Person(val name: String){
    //Instance-level functionality
  }
  def main(args: Array[String]): Unit = {

    println(Person.N_EYES)
    println(Person.canFly)

    //Scala object = Singleton instance
    val mary = Person
    val john = Person
    println(mary == john)

    //class instance
    val mary1 = new Person("Mary")
    val john1 = new Person("John")

    //companions - Objects nd class can access each-others members
    val bobbie = Person.apply(mary1, john1)
    //  val bobbie = Person(mary1,john1) //equivalent
    println(bobbie.name)
  }
  //Scala Applications = Scala objects with
  //def main(args: Array[String]): Unit

}
