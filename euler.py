n = int(input())

fac = [1]*(n+1)

for i in range(2,n+1):
    fac[i] = fac[i-1]*i

s = 0
for i in range(n+1):
    s+=1/fac[i]
print(s)