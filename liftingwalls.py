import itertools
import math

def main():
    l, w, n, r = map(int, input().split())

    walls = [0] * 4
    walls[0] = (-l / 2, 0)
    walls[1] = (l / 2, 0)
    walls[2] = (0, -w / 2)
    walls[3] = (0, w / 2)

    sets = list()
    for nn in range(n):
        x, y = map(int, input().split())

        tmp = set()
        for i in range(4):
            (xx, yy) = walls[i]
            if math.sqrt((x - xx) ** 2 + (y - yy) ** 2) <= r:
                tmp.add(i)
        if len(tmp) > 0:
            sets.append(tmp)
            if len(tmp) == 4:
                print("1")
                return

    total = set()
    for s in sets:
        total = total.union(s)
    if len(total) < 4:
        print("Impossible")
        return

    allidx = range(len(sets))
    for i in range(2, n + 1):
        comb = list(itertools.combinations(allidx, i))
        for tup in comb:
            testset = set()
            for idx in tup:
                testset = testset.union(sets[idx])
            if len(testset) == 4:
                print(i)
                return


main()