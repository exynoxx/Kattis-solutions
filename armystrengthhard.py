t = int(input())
for _ in range(t):
    _ = input()
    ng,nm = list(map(lambda x: int(x),str.split(input()," ")))
    godzilla = list(map(lambda x: int(x),str.split(input()," ")))
    medgodzilla = list(map(lambda x: int(x),str.split(input()," ")))
    godzilla.sort()
    medgodzilla.sort()

    ptx1 = 0
    ptx2 = 0
    while True:
        if ptx1 >= len(godzilla):
            print("MechaGodzilla")
            break
        if ptx2 >= len(medgodzilla):
            print("Godzilla")
            break

        if godzilla[ptx1] >= medgodzilla[ptx2]:
            ptx2+=1
        else:
            ptx1+=1
