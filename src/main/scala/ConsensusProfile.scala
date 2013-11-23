package rosalind
import common._

object ConsensusProfile {
	def main(args: Array[String]){
		val lines = readFASTA("data/rosalind_cons.txt")
		val mat: List[String] = lines.map{ case(x, y) => y }.toList
		val cols = mat.head.length
		def transpose = for (i <- 0 to cols-1) yield mat.map(_(i)).mkString
		val profile: Seq[List[Int]] = transpose map getCount
		writeToFile("data/cons_output.txt", getConsensus(profile) + "\n" + getProfileMatrix(profile))
	}

	def getCount(s: String): List[Int] = 
		List('A', 'C', 'G', 'T').map(x => s.count(y => y == x))

	def getConsensus(profile: Seq[List[Int]]): String = {
		val maxIndices = profile.map(x => x.indexOf(x.max))
		maxIndices.map("ACGT"(_)).mkString
	}

	def getProfileMatrix(profile: Seq[List[Int]]): String = {
		val transpose = for (i <- 0 to 3) yield profile.map(_(i)).mkString(" ")
		val output = List("A: ", "C: ", "G: ", "T: ") zip transpose
		output.map{ case(s1, s2) => s1 + s2 }.mkString("\n")
	}
}