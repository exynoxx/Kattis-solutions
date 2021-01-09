import math

B, Br, Bs, A, As = map(int, input().split())
Bamount = (Br - B) * Bs
x = Bamount / As

if x == int(x):
    print(A+int(x)+1)
else:
    print(A+math.ceil(x))

