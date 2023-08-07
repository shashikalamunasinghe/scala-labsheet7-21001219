object calsqure {
  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5)
    val outputList = calculateSquare(inputList)
    println(outputList)

  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
  }
}
