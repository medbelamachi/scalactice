/**
  * Created by med on 15/05/16.
  * http://aperiodic.net/phil/scala/s-99/
  */
object P01_28 {


  def main(args: Array[String]): Unit = {
    println(last_01_2(List(1, 1, 2, 3, 5, 8)))
  }

  //def last_01(list: List[Int]) = list reduceLeft(_ max _)

  def last_01_2(list: List[Int]): Int = list match {
    case a :: Nil => a
    case a :: tail => last_01_2(tail)
    case _ => throw new IllegalArgumentException
  }
}
