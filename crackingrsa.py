# Given 0<a<b, returns the unique c such that 0<c<b and a*c == gcd(a,b) (mod b).
# In particular, if a,b are relatively prime, returns the inverse of a modulo b.
def invmod(a, b): return 0 if a == 0 else 1 if b % a == 0 else b - invmod(b % a, a) * b // a


for _ in range(int(input())):
    n, e = map(int, input().split())
    for i in range(2, 1001):
        if n % i == 0:
            p = i
            q = n // p
            break

    phi = (p - 1) * (q - 1)
    print(invmod(e, phi) % phi)
