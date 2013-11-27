package rosalind
import common._

object TranslationsTraversions {
	def main(args: Array[String]): Unit = {
		val s1 = "GCAACGCACAACGAAAACCCTTAGGGACTGGATTATTTCGTGATCGTTGTAGTTATTGGAAGTACGGGCATCAACCCAGTT"
 		val s2 = "TTATCTGACAAAGAAAGCCGTCAACGGCTGGATAATTTCGCGATCGTGCTGGTTACTGGCGGTACGAGTGTTCCTTTGGGT"
 		val translations = (s1 zip s2) map getTranslation
 		val tranversions = (s1 zip s2) map getTraversion
 		val ratio: Double = translations/tranversions
 		println(translations.sum)
 		println(tranversions.sum)
	}

	def getTranslation(comb: (Char, Char)): Int = comb match {
		case ('A', 'T') => 1
		case ('G', 'C') => 1
		case _ => 0
	}

	def getTraversion(comb: (Char, Char)): Int = comb match {
		case ('T', 'C') => 1
		case ('G', 'A') => 1
		case _ => 0
	}
	
}