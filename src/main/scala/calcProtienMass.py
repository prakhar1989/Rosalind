f = [l.split() for l in open("monoisotopic_table.txt").readlines()]
monoisotopic_table = dict([(k, float(v)) for [k, v] in f])
input_str = open("rosalind_prtm.txt").read().strip()
answer = sum([monoisotopic_table.get(c) for c in input_str])
print answer