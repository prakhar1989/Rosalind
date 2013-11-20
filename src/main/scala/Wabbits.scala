package rosalind
import common._

object Wabbits {
  def main(args: Array[String]) {
    val n = 33
    val k = 2
    println(fib(n, k))
  }

  def fib(n:Int, k: Int): BigInt = {
    // memoized fibonacci
    def loop(i: Int, n1: BigInt, n2: BigInt): BigInt = 
      if (i == n) n2
      else loop(i+1, k*n2, n1 + n2)
    loop(1, 0, 1)
  }
}

