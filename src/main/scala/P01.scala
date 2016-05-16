

/**
  * Created by med on 15/05/16.
  * http://aperiodic.net/phil/scala/s-99/
  */
object P01_28 {


  def main(args: Array[String]): Unit = {

    //p08
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    //p07
    //println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))

    //p06
    //println(isPalindrome(List(1, 2, 3, 2, 1)))

    //p05
    //println(reverse(List(1, 1, 2, 3, 5, 8)))

    //p04
    //println(length(List(1, 1, 2, 3, 5, 8)))

    //p03
    //println(nth(4, List(1, 1, 2, 3, 5, 8)))

    //p02
    //println(lastButOneElement_3(0, List(1, 1, 2, 3, 5, 8)))

    //p01
    // println(last(List(1, 1, 2, 3, 5, 8)))
  }

  //p08
  def compress[A](ls: List[A]): List[A] = ls.foldRight(List[A]()) {
    (c, r) => if (r.isEmpty || r.head != c) c :: r else r
  }

  /*def compress[A](ls: List[A]): List[A] = ls match {
    case Nil => Nil
    case h :: tail => h :: compress(ls.dropWhile(_ == h))
  }*/

  //p07
  /*def flatten(ls: List[Any]): List[Any] = ls.flatMap {
    case ms: List[_] => flatten(ms)
    case e => List(e)
  }*/


  //p06
  //def isPalindrome[A](ls: List[A]): Boolean = ls == ls.reverse


  //p05
  //def reverse[A](ls: List[A]): List[A] = ls.foldLeft(List[A]()) { (r, h) => h :: r }

  //def reverse[A](ls: List[A]): List[A] = ls.reverse


  //p04
  //def length(ls: List[Int]): Int = ls.foldLeft(0) { (c, _) => c + 1 }

  /*def length(ls: List[Int]): Int = ls match {
    case Nil => 0
    case _ => 1 + length(ls.tail)
  }*/

  //def length(ls: List[Int]): Int = ls.size

  //p03
  /*def nth(i: Int, ls: List[Int]): Int = ls(i)

  nth(i: Int, ls: List[Int]): Int = (i, ls) match {
    case (0, _) => ls.head
    case (x, _ :: tail) => nth(x - 1, tail)
    case (_, Nil) => throw new IllegalArgumentException
  }*/

  //p02
  /*
    def lastButOneElement_3[A](n: Int, ls: List[A]): A = {
      if (n <= 0) throw new IndexOutOfBoundsException
      if (ls.length < n) throw new NoSuchElementException
      ls.takeRight(n).head
    }

     def lastButOneElement_2(list: List[Int]): Int =
      if (list.isEmpty) throw new NoSuchElementException else list.init.last

    def lastButOneElement(list: List[Int]): Int = list match {
      case a :: b :: Nil => a
      case _ :: tail => lastButOneElement(tail)
      case _ => throw new NoSuchElementException
    }*/


  //p01
  /*def last(list: List[Int]) = list reduceLeft(_ max _)

  def last(list: List[Int]): Int = list match {
    case a :: Nil => a
    case a :: tail => last_01_2(tail)
    case _ => throw new NoSuchElementException
  }*/
}
