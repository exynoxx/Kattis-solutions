n = int(input())

def sumofdigits(x):
    s = 0
    for c in str(x):
        s += int(c)
    return s

while True:
    if n % sumofdigits(n) == 0:
        print (n)
        break
    else:
        n+=1