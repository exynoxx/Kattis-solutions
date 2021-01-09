t = int (input())

res = []

for i in range(0,t):
    n = int(input())

    if (n % 400) == 0:
        res.append(n/400)
    else:
        res.append(n/400+1)

for k in res:
    print(int(k))