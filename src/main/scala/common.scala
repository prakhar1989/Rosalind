package rosalind

object common {
  def readFile(filename: String) = {
    val source = scala.io.Source.fromFile(filename)
    val lines = source.mkString
    source.close
    lines
  }

  def readLines(filename: String) = {
    val source = scala.io.Source.fromFile(filename)
    val lines = source.getLines
    lines
  }

  def readFasta(filename: String) = {
    val source = scala.io.Source.fromFile(filename)
    val lines = source.getLines
  }
}
