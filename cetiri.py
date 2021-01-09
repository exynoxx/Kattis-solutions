n = str.split(input(), " ")
n = [int(i) for i in n]
n.sort()

diff = []

for i in range(0,len(n)-1):
    diff.append(n[i+1] - n[i])

std = min(diff)
for i in range(0,len(n)-1):
    if n[i+1] != n[i] + std:
        print(n[i]+std)
        exit()

print(n[len(n)-1]+std)