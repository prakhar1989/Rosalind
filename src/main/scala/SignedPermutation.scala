package rosalind
import common._

object SignedPermutation {
  def main(args: Array[String]) {
    val n = 2
    val xs = (-n to n) filter (_ != 0)
    val count = (xs combinations(2)).length
    println(count)
    //(xs permutations(2)).map(_ mkString(" ")).foreach(println)
  }
}

