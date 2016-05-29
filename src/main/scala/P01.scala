

/**
  * Created by med on 15/05/16.
  * http://aperiodic.net/phil/scala/s-99/
  */
object P01_28 {


  def main(args: Array[String]): Unit = {

    //p21
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))

    //p20
    //println(removeAt(1, List('a, 'b, 'c, 'd)))

    //p19
    //println(rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    //p18
    //println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    //p17
    //println(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    //p16
    //println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))

    //p15
    //println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))

    //p13
    //println(encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    //p12
    //println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))


    //p10 -11
    //println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    //p09
    //println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

    //p08
    //println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

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

  //p21
  def insertAt[A](x: A, p: Int, ls: List[A]): List[A] = ls.splitAt(p) match {
    case (pre, post) => pre ::: x :: post
  }

  //p20
  /*def removeAt[A](n: Int, ls: List[A]): (List[A], A) = ls.splitAt(n) match {
    case (Nil, _) if n < 0 => throw new NoSuchElementException
    case (pre, e :: post) => (pre ::: post, e)
    case (pre, Nil) => throw new NoSuchElementException
  }*/

  /*def removeAt[A](n: Int, ls: List[A]): (List[A], A)  = (n, ls) match {
    case (0, h :: x :: tail) => (h :: tail, x)
    case (_, _) => removeAt(n - 1, ls)
  }*/

  //p19
  /*def rotate[A](n: Int, ls: List[A]): List[A] = (n, ls) match {
    case (0, _) => ls
    case (_, h :: tail) => ls.drop(n) ::: ls.take(n)
  }*/

  //p18
  /* def slice[A](s: Int, e: Int, ls: List[A]): List[A] = (s, e, ls) match {
    case (_, _, Nil) => Nil
    case (_, 0, _) => Nil
    case (0, _, h :: tail) => h :: slice(0, e - 1, tail)
    case (_, _, h :: tail) => slice(s - 1, e - 1, tail)
  } */

  //p17 // you can use also ls.splitAt(n)
  //def split[A](n: Int, ls: List[A]): (List[A], List[A]) = (ls.take(n), ls.drop(n))

  //p16
  /*def drop[A](n: Int, ls: List[A]): List[A] = ls.zipWithIndex filter { v => (v._2 + 1) % n != 0 } map {
    _._1
  }*/

  /*def drop[A](n: Int, ls: List[A]): List[A] = {
    def dropR(c: Int, curList: List[A]): List[A] = (c, curList) match {
      case (_, Nil) => Nil
      case (1, _ :: tail) => dropR(n, tail)
      case (_, h :: tail) => h :: dropR(c - 1, tail)
    }
    dropR(n, ls)
  }*/

  //p15
  //def duplicateN[A](n: Int, ls: List[A]): List[A] = ls flatMap { e => List.fill(n)(e) }


  //p14
  //def duplicate[A](ls: List[A]): List[A] = ls flatMap { e => List(e, e) }


  //p13
  /*  def encodeDirect[A](ls: List[A]): List[(Int, A)] = {
      if (ls.isEmpty) Nil
      else {
        val (span1, span2) = ls span {
          _ == ls.head
        }
        (span1.length, span1.head) :: encodeDirect(span2)
      }

    }*/

  //p12
  //  def decode[A](ls: List[(Int, A)]): List[A] = ls flatMap { e => List.fill(e._1)(e._2) }

  /*def decode[A](ls: List[(Int, A)]): List[A] = {
    def addElem[A](n: Int, ls: List[A]): List[A] = ls match {
      case _ if n == 0 => Nil
      case x :: tail => x :: addElem(n - 1, ls)
    }
    ls.foldLeft(List[A]()) { (r, c) => r ::: addElem(c._1, c._2 :: r) }
  }
*/

  //p11
  //  def encodeModified[A](ls: List[A]): List[Any] = encode(ls) map { e => if (e._1 == 1) e._2 else e }


  //p10
  /*def encode[A](ls: List[A]): List[(Int, A)] = pack(ls).foldLeft(List[(Int, A)]()) {
    (r, c) => r ::: List((c.length, c.head))
  }*/


  //p09
  /*def pack[A](ls: List[A]): List[List[A]] = ls match {
    case Nil => Nil
    case h :: tail => List(ls.takeWhile(_ == h)) ::: pack(tail.dropWhile(_ == h))
  }*/


  //p08
  /*def compress[A](ls: List[A]): List[A] = ls.foldRight(List[A]()) {
    (c, r) => if (r.isEmpty || r.head != c) c :: r else r
  }*/

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
