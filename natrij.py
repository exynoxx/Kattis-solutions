inn1 = str.split(input(), ":")
inn2 = str.split(input(), ":")

a=b=c=0

c = (int(inn2[2])-int(inn1[2]))
if c < 0:
    c = c % 60
    b = 1

b = (int(inn2[1])-(b+int(inn1[1])))
if b < 0:
    b = b % 60
    a = 1

a = (int(inn2[0])-(a+int(inn1[0]))) % 24

if a == 0 and b == 0 and c == 0:
    print("24:00:00")
else:
    a = str(a)
    if len(a) == 1:
        a = "0" + a
    b = str(b)
    if len(b) == 1:
        b = "0" + b
    c = str(c)
    if len(c) == 1:
        c = "0" + c

    print(str(a) + ":" + str(b) + ":" + str(c))
