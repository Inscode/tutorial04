object PatternMatchingExample {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val input = args(0).toInt
      val message = input match {
        case num if num <= 0 => "Negative/Zero is input"
        case num if num % 2 == 0 => "Even number is given"
        case num => "Odd number is given"
      }
      println(message)
    } else {
      println("No input provided.")
    }
  }
}
