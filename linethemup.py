def main ():
    n = int(input())
    list = []

    mode = ""

    for i in range(0,n):
        s = input()
        list.append(s)

    prev = ""

    for word in list:
        if len(prev) == 0:
            prev = word
            continue

        if getBiggest(word, prev):
            if mode == "DECREASING":
                mode = "NEITHER"
            if len(mode) == 0:
                mode = "INCREASING"
        else:
            if mode == "INCREASING":
                mode = "NEITHER"
            if len(mode) == 0:
                mode = "DECREASING"
        prev = word


    print(mode)

def getBiggest (current, old):

    for i in range(0,min(len(current),len(old))):
        if current[i] != old[i]:
            if ord(current[i]) > ord(old[i]):
                return True
            else:
                return False

    if len(current) > len(old):
        return True
    else:
        return False

main()