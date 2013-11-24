f = open("codon_table.txt").read().split()
codon_table = dict([(f[i-1], f[i]) for i in range(1, len(f), 2)])
input_str = open("rosalind_prot.txt").read().strip()
answer = []
for i in (input_str[i:i+3] for i in range(0, len(input_str), 3)):
    answer.append(codon_table[i])
print "".join(answer)
