package rosalind
import java.io._

object common {
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
