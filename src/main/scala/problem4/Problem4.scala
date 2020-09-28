package problem4

object Problem4 extends App {

  val r = 100 to 999

  def isPalindrome(value: Int): Boolean = value.toString.reverse == value.toString
  val x = r.flatMap(f => r.map(y => y * f)) filter isPalindrome
  println(x.max)


  // Method no 2
  val result: IndexedSeq[Int] = for {
    i <- r
    j <- r
    if isPalindrome(i*j)
  } yield i * j

  println(result.max)
}
