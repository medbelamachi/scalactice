/**
  * Created by med on 07/05/16.
  */
object Document {
  def main(args: Array[String]) : Unit =  {
    val scala = "Scala!!"
    val books = List("Beginning Scala", 'c',"Beginning Groovy", "Beginning Java")
    // val books2 = for {book <- books if(book.contains("Scala"))} yield  book
     val x = try{Integer.parseInt("dog")}catch{case _ => 0}
    println(books.filter {
      case s: String => true
      case _ => false
    } tail )
  }
  def sayHello(number:Int) = "Hello" + number



}
