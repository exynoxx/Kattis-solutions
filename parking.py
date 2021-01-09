import sys
import math

abc = input().split(" ")
abc = list(map(int, abc))
abc.insert(0, 0)
l = []
minn = 10000
maxx = 0
for i in range(0,3):
    line = input().split(" ")
    a = int(line[0])
    b = int(line[1])
    minn = min(a,minn)
    maxx = max(b,maxx)
    l.append((a, b))

sum = 0
for i in range(minn,maxx+1):

    k=0
    for pair in l:
        if i >= pair[0] and i < pair[1]:
            k+=1

    sum += abc[k]*k

print(sum)


