d = {}

while True:
    l = input()
    if l == "0":
        break

    line = str.split(l," ")

    if "=" in l:
        #assign
        d[line[0]] = int(line[2])
    else:
        terms = list(filter(lambda x: x != "+", line))
        numeric = 0
        ret = []
        numberPresent = False
        numberInDict = False
        for e in terms:
            if e.isdigit():
                numeric += int(e)
                numberPresent = True
            elif e in d:
                numeric += d[e]
                numberInDict = True
            else:
                ret.append(e)


        if numberPresent or numberInDict:
            print(numeric,end="")
        if len(ret)>0:
            if numberPresent or numberInDict:
                for i in range(0, len(ret)):
                    print(" + " + ret[i], end="")
            else:
                print(ret[0],end="")
                for i in range(1,len(ret)):
                    print(" + "+ret[i], end="")

        print("")