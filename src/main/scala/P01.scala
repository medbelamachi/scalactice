/**
  * Created by med on 15/05/16.
  * http://aperiodic.net/phil/scala/s-99/
  */
object P01_28 {


  def main(args: Array[String]): Unit = {
    //p01
      println( last_01(List(1, 1, 2, 3, 5, 8)))
  }

  def last_01(list: List[Int]) = list reduceLeft(_ max _)
}
