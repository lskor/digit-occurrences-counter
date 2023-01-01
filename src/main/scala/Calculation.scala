
object Calculation

	def countOccurrences(number: Int): Map[Int, Int] =
		number
			.toString
			.map(_.asDigit)
			.groupBy(identity).view
			.mapValues(_.size).toMap