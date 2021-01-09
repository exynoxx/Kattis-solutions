n = int(input())
s = 0
for tt in range(n):
    l = input()
    end = l[-1]
    start = l[:-1]
    s += int(start)**int(end)
print(s)