bestIdx = 0
bestVal = 0

for i in range(1,6):
    l = list(map(lambda x: int(x), str.split(input(), " ")))
    if sum(l) > bestVal:
        bestVal = sum(l)
        bestIdx = i

print(bestIdx, bestVal)