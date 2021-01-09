t = int(input())
for _ in range(t):
    n = int(input())
    l = list(map(int, input().split()))
    if n == 1:
        print(0)
    else:
        l.sort()
        print(min(2*abs(l[0]-p)+2*abs(l[-1]-p) for p in l))
