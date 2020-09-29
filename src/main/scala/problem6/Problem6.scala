package problem6

/**
 * The sum of the squares of the first ten natural numbers is,
 *
 * The square of the sum of the first ten natural numbers is,
 *
 * Hence the difference between the sum of the squares
 * of the first ten natural numbers and the square of the sum is .
 *
 * Find the difference between the sum of the squares of the first one hundred natural
 * numbers and the square of the sum.
 */
object Problem6 extends App {
  def squareEach(n: Int): Int = {
    (1 to n).toList.iterator.map(i => i * i).sum
  }

  def squareSumN(n: Int): Int = {
    math.pow((1 to n).sum, 2).toInt
  }

  val number = 100
  val result = squareSumN(number) - squareEach(number)
  println(result)

}
