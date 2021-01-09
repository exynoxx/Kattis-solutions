from math import floor

n = int(input())
l = [int(input()) for i in range(n)]
l.sort(reverse=True)
s = 0
for i in range(0,3*floor(n/3),3):
    s += l[i]+l[i+1]
s+=sum(l[3*floor(n/3):])
print(s)