package lectures.part2oops

object OOExercises extends App {
  //Exercises
  val author = Writer("nitheesh","prabakran",1999)
  val author1 = Writer("aa","bb",1999)
  author.fullname
  val novel = Novel("rich daddy poor daddy",2002,author)
  println(novel.isWrittenBy(author))
  println(novel.authorAge())
  val a1 = novel.copy(2050)
  val a = Counter(12)
  a.dec(10).print

}
//OO exercise


class Writer(val first_name: String, val surname: String,val year: Int){
  def fullname: String = first_name+" "+surname
}

class Novel(val name: String,val year: Int, val author: Writer){
  def authorAge() = year - author.year
  def isWrittenBy(author: Writer):Boolean = author.first_name == this.author.first_name
  def copy(ny: Int): Novel = {
    new Novel(this.name,ny,this.author)
  }
}

// class counter


class Counter(val count: Int = 0) {
  def inc = {
    println("incrementing")
    new Counter(count + 1)
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }
  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.inc(n-1)
  }
  def dec(n: Int): Counter = {
    if(n <= 0) this
    else dec.dec(n-1)
  }
  def print = println(count)

}






