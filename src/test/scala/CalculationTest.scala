
class CalculationsTest extends munit.FunSuite:

	def checkOccurrencesMap(name: String, number: Int, expected: Map[Int, Int]): Unit =
		test(name) {
			val obtained = countOccurrences(number)
			assertEquals(obtained, expected)
		}

	checkOccurrencesMap("only one digit in number", 1, Map(1 -> 1))
	checkOccurrencesMap("only one digit in map", 333333, Map(3 -> 6))

	checkOccurrencesMap("3 times in number", 454545, Map(4 -> 3, 5 -> 3))
	checkOccurrencesMap("3 times where order it doesn't matter", 555444, Map(4 -> 3, 5 -> 3))

	checkOccurrencesMap("number from example in readme", 985959, Map(9 -> 3, 5 -> 2, 8 -> 1))
	checkOccurrencesMap(
		"all digit is unique",
		1023456789,
		Map(0 -> 1, 1 -> 1, 2 -> 1, 3 -> 1, 4 -> 1, 5 -> 1, 6 -> 1, 7 -> 1, 8 -> 1, 9 -> 1))

	// final val MaxValue: Int(2147483647)
	checkOccurrencesMap(
		"max int value number", 
		Int.MaxValue, 
		Map(1 -> 1, 2 -> 1, 3 -> 1, 4 -> 3, 6 -> 1, 7 -> 2, 8 -> 1))
