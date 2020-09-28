package problem7

import problem3.Problem3Solution2.isPrime

import scala.annotation.tailrec

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
object Problem7 extends App {
  def nextPrime(n: Int): Int =
    Iterator.from(n).find(isPrime(_)).get

  val end = 6

  @tailrec
  def applyUntil(f: Int => Int, start: Int, end: Int, result: Int): Int = {
    if (start >= end ) result
    else
      applyUntil(f, start+1, end, f(result+1))
  }

  val lastPrime = applyUntil(nextPrime, 1, end, 2)
  println(lastPrime)

// Ned to understand better for currying
//  def applyBetter(f: Int => Int, n: Int, end: Int): (Int => Int) = {
//    if(n == end) (x: Int) =>  f(x)
//    else (x: Int) => {
//      println(n, f(n))
//      applyBetter(f, n+1, end)(f(x+1))
//    }
//  }
//
//  val lastPrime2 = applyBetter(nextPrime, 1, 6)
//  println(lastPrime2(1))
}
