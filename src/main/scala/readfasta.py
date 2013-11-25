def read_fasta(fp):
    name, seq = None, []
    for line in fp:
        line = line.rstrip()
        if line.startswith(">"):
            if name: yield (name, ''.join(seq))
            name, seq = line, []
        else:
            seq.append(line)
    if name: yield (name, ''.join(seq))

if __name__ == "__main__":
	with open('rosalind_splc.txt') as fp:
	    for name, seq in read_fasta(fp):
	        print(name, seq)
