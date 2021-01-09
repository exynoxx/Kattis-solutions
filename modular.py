def egcd(a, b):
    if a == 0:
        return (b, 0, 1)
    else:
        g, y, x = egcd(b % a, a)
        return (g, x - (b // a) * y, y)

def modinv(a, m):
    g, x, y = egcd(a, m)
    if g != 1:
        return -1
    else:
        return x % m

while True:
    n, t = map(lambda x: int(x), str.split(input(), " "))
    if n == 0 and t == 0:
        break

    for case in range(t):
        inn = input()
        l = str.split(inn, " ")
        a = int(l[0])
        b = int(l[2])
        op = l[1]

        if op != "/":
            e = eval(inn)
            print(e%n)
        else:
            num1 = modinv(b,n)
            if num1 == -1:
                print(-1)
            else:
                print((a*num1)%n)

