from readfasta import read_fasta

# get codon table
f = open("dna_codon_table.txt").read().split()
dna_codon_table = dict([(f[i-1], f[i]) for i in range(1, len(f), 2)])

# process input
input_list = []

with open('rosalind_splc.txt') as fp:
	    for name, seq in read_fasta(fp):
	        input_list.append(seq)

input_string = input_list[0]
exons = input_list[1:]

# indices
for e in exons:
	t = input_string.find(e)
	input_string = input_string[:t] + input_string[t+len(e):]

final_coding = [dna_codon_table.get(input_string[i:i+3]) \
				for i in range(0, len(input_string), 3)]

print "".join(final_coding)

