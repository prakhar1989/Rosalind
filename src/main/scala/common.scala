package rosalind

object common {
  def readFile(filename: String) = {
    val source = scala.io.Source.fromFile(filename)
    val lines = source.mkString
    source.close
    lines
  }
}
