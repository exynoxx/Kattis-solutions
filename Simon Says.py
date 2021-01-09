n = int(input())

for i in range(0,n):
    s = str.split(input())
    try:
        if s[0] == "simon" and s[1] == "says":
            print((" ".join(s))[11:])
    except IndexError:
        print("")