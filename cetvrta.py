from collections import defaultdict

x = defaultdict(int)
y = defaultdict(int)

for i in range(3):
    a,b = list(map(lambda x: int(x), str.split(input(), " ")))
    x[a] += 1
    y[b] += 1

finalx = 0
finaly = 0
for k,v in x.items():
    if v == 1:
        finalx = k
for k,v in y.items():
    if v == 1:
        finaly = k
print(finalx, finaly)