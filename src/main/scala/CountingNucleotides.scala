package rosalind
import common._

object CountingDNA {
  def main(args: Array[String]) {
    val s = readFile("data/rosalind_dna.txt")
    println(List('A', 'C', 'G', 'T').map(x => s.count(y => y == x)).mkString(" "))
  }
}