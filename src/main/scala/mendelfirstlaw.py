(HE, HR, HD) = tuple(map(int, open("rosalind_iprb.txt").read().split()))
total = float(HE + HR + HD)

prob_HE = HE / total
prob_HR = HR / total
prob_HD = HD / total

# 3 possible cases
case1 = prob_HD # pick HD first

# pick HE first followed HD or HE (again) or HR
case2 = prob_HE * (HD + 0.75 * (HE-1.0) + 0.5*HR)/(total-1.0)

# pick HR first followed by HD or HE or HR (again)
case3 = prob_HR * (HD + 0.5*HE + 0)/(total-1.0)

print sum([case1, case2, case3])
