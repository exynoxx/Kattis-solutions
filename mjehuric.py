n = str.split(input(), " ")
n = list(map(int, n))

while n != [1,2,3,4,5]:
    for i in range(0,4):
        if n[i] > n[i+1]:
            n[i],n[i+1] = n[i+1],n[i]
            print (' '.join(str(x) for x in n))
            continue
