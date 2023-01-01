import scala.util.Random

object Service:

	def count(number: Int) = countOccurrences(number)

	// return int value between 0 (inclusive) and the int maximum value (exclusive)
	def randomInt: Int = Random.nextInt(Int.MaxValue)