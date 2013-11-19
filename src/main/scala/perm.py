def get_perm(xs):
    print "xs: ", xs
    if len(xs) <= 1:
        yield xs
    else:
        for perm in get_perm(xs[1:]):
            for i in range(len(perm)+1):
                yield perm[:i] + xs[0:1] + perm[i:]

if __name__ == "__main__":
    n = 3
    for i in get_perm(list(range(1, n+1))):
        print i
