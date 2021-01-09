n = 0

def iterate(idx):
    sum = 0
    for i in n:
        sum += i
    if (sum / 2) == n[idx]:
        print(n[idx])
        return 1
    else:
        return 0

while True:
    try:
        n = str.split(input())
        n = list(map(int, n))

        for i in range(0,len(n)):
            if iterate(i) == 1:
                break
    except EOFError:
        break
