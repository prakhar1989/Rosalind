package rosalind
import common._

object TransitionsTraversions {
	def main(args: Array[String]): Unit = {
		val lines = readFASTA("data/rosalind_tran.txt").map{ case(_, x) => x }.toList
		val s1 = lines(0)
		val s2 = lines(1)
 		val transitions = (s1 zip s2) map getTransition
 		val traversions = (s1 zip s2) map getTraversion
 		val ratio: Double = transitions.sum / traversions.sum.toDouble
 		println(ratio)
	}

	def getTransition(comb: (Char, Char)): Int = comb match {
		case ('A', 'G') => 1
		case ('G', 'A') => 1
		case ('C', 'T') => 1
		case ('T', 'C') => 1
		case _ => 0
	}

	def getTraversion(comb: (Char, Char)): Int = comb match {
		case ('A', 'C') => 1
		case ('C', 'A') => 1
		case ('A', 'T') => 1
		case ('T', 'A') => 1
		case ('G', 'T') => 1
		case ('T', 'G') => 1
		case ('G', 'C') => 1
		case ('C', 'G') => 1
		case _ => 0
	}
	
}