package rosalind
import common._

object Permutations {
  def main(args: Array[String]) {
    val n = 5
    println(fact(n))
    (1 to n).toList.permutations.map(_.mkString(" ")).foreach(println)
  }

  def fact(n: Int): Int = n match {
    case 0 => 1
    case x => x * fact(x - 1)
  }
    


}

