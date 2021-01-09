import sys
from queue import Queue

l = sys.stdin.readline().split()
p = int(l[0])
t = int(l[1])

A = [set() for _ in range(p+1)]

for line in sys.stdin:
    pt = line   .split()
    i = int(pt[0])
    j = int(pt[1])
    A[i].add(j)


count = 1
for i in range(1,p):

    newclass = True
    for j in range(i+1,p+1):
        if A[i] == A[j]:
            newclass = False
    if newclass == True:
        count += 1

print(count)