object filterPrime {
  def isPrime(number: Int): Boolean = {
    if (number <= 1) return false
    if (number <= 3) return true

    // A prime number (except 2 and 3) is of the form 6k ± 1
    if (number % 2 == 0 || number % 3 == 0) return false

    var i = 5
    while (i * i <= number) {
      if (number % i == 0 || number % (i + 2) == 0)
        return false
      i += 6
    }
    true
  }

  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(isPrime)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val outputList = filterPrime(inputList)
    println(outputList)

  }
}
