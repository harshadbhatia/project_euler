package problem5

import scala.util.control.Breaks.{break, breakable}

/**
 * 2520 is the smallest number that can be divided by each
 * of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly
 * divisible by all of the numbers from 1 to 20?
 */
object Problem5 extends App {
  val number = 2520
  (1 to 10) filterNot (n => 2520 % n == 0)

  def isDivisor(n: Int): Boolean =
    (2 to 20).toList forall (i => n % i == 0)

  val result = (2 to Int.MaxValue).iterator.find(isDivisor)
  println(result)



}
