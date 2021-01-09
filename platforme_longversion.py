n = int(input())

l = []
for uyt in range(n):
    y,x1,x2 = list(map(int, input().split(" ")))
    l.append((x1,x2,y))

l.sort(key=lambda x:x[2])
res = 0
activelist = []
for e in l:
    x1,x2,yy = e

    if not activelist:
        res += yy*2
    else:
        platforme_support_left = [y[2] for y in activelist if y[2] < yy and y[0] <= x1 < y[1]]
        platforme_support_right = [y[2] for y in activelist if y[2] < yy and y[0] < x2 <= y[1]]

        y_left = max(platforme_support_left) if len(platforme_support_left)>0 else 0
        y_right = max(platforme_support_right) if len(platforme_support_right)>0 else 0

        res += yy - y_left
        res += yy - y_right

    activelist.append((x1, x2, yy))

print(res)