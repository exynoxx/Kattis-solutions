def solve():
    n = int(input())
    l = []
    for i in range(n):
        l.append(int(input()))


    l.sort(reverse=True)
    best = 0
    for i in range(0, len(l)):
        if i+1 <= l[i]:
            best = i+1
        else:
            break
    print(best)
solve()