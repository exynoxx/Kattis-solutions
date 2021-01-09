l = str.split(input(), " ")
a = int(l[0])
b = int(l[1])

s = a*b
while s/a > b-1:
     s-=1
print(s+1)