d = {}


def commando():
    global d
    ll = input()
    l = ll.split()
    printl = " ".join(l[1:])
    if l[0] == "def":
        d[l[1]] = int(l[2])
    elif l[0] == "clear":
        d = {}
    elif l[0] == "calc":
        for i in range(1, len(l), 2):
            if l[i] not in d:
                print(printl, "unknown")
                return
        s = ""
        for i in range(1, len(l)-1):
            if i % 2 == 0:
                s += l[i]
            else:
                s += str(d[l[i]])
        number = eval(s)
        for k, v in d.items():
            if v == number:
                print(printl, k)
                return
        print(printl, "unknown")


while True:
    try:
        commando()
    except EOFError:
        break
