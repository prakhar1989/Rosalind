package rosalind
import common._

object CombiningHaystack {
	def main(args: Array[String]) {
		val lines = readLines("data/rosalind_subs.txt").toList
	    strMatching(lines(0), lines(1))
	    println()
	}

	// Brute force pattern matching
	def strMatching(txt: String, pat: String): Unit = {
		val N = txt.length
		val M = pat.length
		for (i <- 1 to N-M) {
			var j = 0
			while (j < M && pat(j) == txt(i+j)) {
				if (j == M-1) print(s"${i+1} ")
				j = j + 1
			}
		}
	}
}