while True:
    n = int(input())
    if n == 0:
        break

    list1 = [int(input()) for i in range(n)]
    list2 = [int(input()) for i in range(n)]

    slist1 = sorted(list1)
    slist2 = sorted(list2)

    hm = [0] * 10000

    for i in range(n):
        hm[slist1[i]] = slist2[i]

    for i in range(n):
        print(hm[list1[i]])

    print("")


