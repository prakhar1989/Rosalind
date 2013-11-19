package rosalind
import common._

object Transcribing {
  def main(args: Array[String]) {
    println(readFile("data/rosalind_rna.txt").replace("T", "U"))
  }
}
