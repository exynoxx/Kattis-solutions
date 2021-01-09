n = int(input())
l = list(map(lambda x: int(x),str.split(input()," ")))
def func(x):
    return x ^ (x*2) & 0xFF
def invert(x):
    for y in range(0,256):
        if x == func(y):
            return y

for x in l:
    print(invert(x), end=" ")
print("")