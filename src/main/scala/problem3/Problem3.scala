package problem3

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 * prime number is number divisible by one or itself
 * prime factor of a number is calculated by modulus with a prime number
 * x * x < n (where n is number)
 * 2 ways to solve this problem
 * Generate a list of prime and divide each prime until mod value is 0
 * Or start with i*i < n and mod n with i, if found then divide the number by i,
 * i*i should terminate on the next iteration
 */
object Problem3 extends App {
  var n: Long = 600851475143L
  var i: Long = 2

  while (i * i < n) {
    while (n % i == 0) { n = n / i }
    i = i + 1
  }

  println(n)

}

object Problem3Solution2 extends App {
  var number: Long = 600851475143L
  //  var number: Long = 13195
  def isPrime(n: Long): Boolean = {
    !((2L to math.sqrt(n).toLong) exists (n % _ == 0))
  }

  def primeFactors(number: Long) = for {
    i <- 2L to math.sqrt(number).toLong
    if isPrime(i) && number % i == 0
  } yield i


  println("Largest", primeFactors(number).max)

}
