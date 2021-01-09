r = []
while True:
    try:
        inn = input()
        r.append(inn)
    except EOFError:
        break
for s in r:
    l = str.split(s, " ")
    a = int(l[0])
    b = int(l[1])

    c = abs(a-b)
    print(c)
