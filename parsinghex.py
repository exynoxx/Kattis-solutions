try:
    while True:
        l = input().lower()
        s = 0
        e = 0
        i = 0
        while i < len(l):
            if l[i] == "0" and l[i + 1] == "x":
                s = i
                e = i + 2
                while e < len(l) and e - s <= 9 and (97 <= ord(l[e]) <= 102 or 48 <= ord(l[e]) <= 57):
                    e += 1
                if s != e - 2:
                    stringg1 = l[s:e]
                    stringg2 = int(l[s:e], 16)
                    print(stringg1, stringg2)
                    i = e + 1
            else:
                i += 1
except:
    pass

