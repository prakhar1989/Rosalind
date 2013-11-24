package rosalind
import common._

object ProtienMass {
	def main(args: Array[String]) {
		val input_table = readLines("data/monoisotopic_table.txt")
		val input_list = input_table.map(s => s.split(' ')).toList
		println(input_list.map(_(0).length))
	}
}