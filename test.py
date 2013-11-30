tt = {
    frozenset(['A', 'G']): 'transition',
    frozenset(['C', 'T']): 'transition',
    frozenset(['A', 'C']): 'transversion',
    frozenset(['G', 'T']): 'transversion',
    frozenset(['A', 'T']): 'transversion',
    frozenset(['C', 'G']): 'transversion',
}


if __name__ == '__main__':
    rec1 = "GCAACGCACAACGAAAACCCTTAGGGACTGGATTATTTCGTGATCGTTGTAGTTATTGGAAGTACGGGCATCAACCCAGTT"
    rec2 = "TTATCTGACAAAGAAAGCCGTCAACGGCTGGATAATTTCGCGATCGTGCTGGTTACTGGCGGTACGAGTGTTCCTTTGGGT"
    transitions, transversions = 0.0, 0.0
    for s1, s2 in zip(rec1, rec2):
        diff = tt.get(frozenset([s1, s2]))
        if diff:
            if diff == 'transition':
                transitions += 1
            elif diff == 'transversion':
                print s1, s2
                transversions += 1
    print transitions, transversions
    print(transitions/transversions)