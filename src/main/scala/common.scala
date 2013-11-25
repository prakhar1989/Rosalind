package rosalind
import java.io._

object common {
  //val DNACodonTable = Map('TTT' -> 'F', 'TTC' -> 'F')
  // val monoisotopicTable = Map(A -> 71.03711, C -> 103.00919, D -> 115.02694, E -> 129.04259, 
  //   F -> 147.06841, G -> 57.02146, H -> 137.05891, I -> 113.08406, K -> 128.09496, L -> 113.08406, 
  //   M -> 131.04049, N -> 114.04293, P -> 97.05276, Q -> 128.05858, R -> 156.10111, S -> 87.03203, 
  //   T -> 101.04768, V -> 99.06841, W -> 186.07931, Y -> 163.06333)

  // val monoisotopicTable: Map[String, Int] = {
  //   val listOfValues = readLines("data/monoisotopic_table.txt").toList.flatMap(_.split(' '))
  // }

  def readFile(filename: String): String = { 
    val source = scala.io.Source.fromFile(filename)
    val lines = source.mkString
    source.close
    lines
  }

  def readLines(filename: String): Iterator[String] = {
    val source = scala.io.Source.fromFile(filename)
    val lines = source.getLines
    lines
  }

  def readFASTA(filename: String) = {
    val lines = readFile(filename)
    val Process = ">([a-zA-Z]+_[0-9]+)\n([ACTG\n]+)".r
    for (p <- Process.findAllIn(lines)) yield p match {
      case Process(x, y) => (x, y.replaceAll("\n", ""))
    }
  }

  def writeToFile(filename: String, msg: String) = {
    val writer = new PrintWriter(new File(filename))
    writer.write(msg)
    writer.close()
  }
}
