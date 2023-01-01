import Service.{count, randomInt}

@main
def main(): Unit =

  val number = randomInt
  val result = count(number).map((digit, times) => s"$digit - $times times").mkString(", ")

  println(s"Number is: $number")
  print(s"There are $result")
