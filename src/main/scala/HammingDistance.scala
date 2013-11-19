package rosalind
import common._

object HammingDistance {
  def main(args: Array[String]) {
    val s = readFile("data/test_hamming.txt")
    val a = s.take(s.indexOf("\n"))
    val b = s.drop(s.indexOf("\n") + 1)
    println(getHamming(a, b))
  }

  def getHamming(a: String, b: String): Int = {
    a.length - ((a zip b) filter ((xy) => xy._1 == xy._2)).length
  }
}

