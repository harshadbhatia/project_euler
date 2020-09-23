package problem1

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
object Problem1 extends App {
  def sumMultiples(n: Int): Int = {
    (1 until n).filter( e => (e % 3 == 0 || e % 5 == 0)).sum
  }

  println(sumMultiples(1000))
}
