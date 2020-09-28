package problem4

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
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
