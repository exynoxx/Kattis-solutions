from itertools import chain, combinations

def solve():
    inn = list(map(int, input().split(" ")))[1:]
    l = chain.from_iterable(combinations(inn, r) for r in range(len(inn) + 1))
    hs = {}
    for e in l:
        sume = sum(e)
        if sume in hs:
            if len(hs[sume].intersection(set(e))) == 0:
                print(*hs[sume])
                print(*e)
                return
        else:
            hs[sume] = set(e)
    print("Impossible")


t = int(input())
for i in range(t):
    print("Case #" + str(i + 1) + ":")
    solve()
