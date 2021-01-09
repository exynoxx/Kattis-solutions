xa,ya = list(map(lambda x: int(x),str.split(input()," ")))
xb,yb = list(map(lambda x: int(x),str.split(input()," ")))
xc,yc = list(map(lambda x: int(x),str.split(input()," ")))

def area(xa,ya,xb,yb,xc,yc):
    return abs(xa*(yb-yc)+xb*(yc-ya)+xc*(ya-yb))/2

A=area(xa,ya,xb,yb,xc,yc)

n = int(input())
count = 0
for i in range(n):
    x,y = list(map(lambda x: int(x), str.split(input(), " ")))
    A1 = area(x,y,xb,yb,xc,yc)
    A2 = area(xa,ya,x,y,xc,yc)
    A3 = area(xa,ya,xb,yb,x,y)
    if A==A1+A2+A3:
        count += 1
print("{:.1f}".format(A))
print(count)