package rosalind
import common._

object GCContent {
  def main(args: Array[String]) {
    val s = readLines("data/gc_counting.txt")
    println(s.grouped(2).foreach(xy => println(s"${xy(0)} - ${gc_content(xy(1))}")))
  }

  def gc_content(s: String): Double = {
    val s1 = s.filter(_ != ' ')
    100 * (s.count(_ == 'G') + s.count(_ == 'C')) / (s1.length).toDouble
  }
}
