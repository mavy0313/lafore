package chapter5

fun main() {
  val n = 4
  val factorial = Factorial()
  val result = factorial.calc(n)
  println("Factorial of $n is $result")
}

class Factorial {
  fun calc(n: Int): Int {
    return when (n) {
      1 -> 1
      else -> n * calc(n - 1)
    }
//    if (n == 1) {
//      return 1
//    } else {
//      return n * calc(n - 1)
//    }
  }

}
