package rosalind
import common._

object Complementing {
  def main(args: Array[String]) {
    val s = readFile("data/rosalind_revc.txt")
    println(s.reverse map complement)
  }

  def complement(x: Char): Char = x match {
    case 'A' => 'T'
    case 'C' => 'G'
    case 'T' => 'A'
    case 'G' => 'C'
    case _ => x
  }

}
