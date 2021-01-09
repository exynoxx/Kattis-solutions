n = int(input())

for case in range(n):
    l = list(map(lambda x:int(x), str.split(input()," ")))
    m = l[0]
    l = l[1:]
    ll = [(l[i*2],l[i*2+1]) for i in range(0,m)]
    s = 0
    for i in range(0,m-1):
        s += ll[i][0]*ll[i+1][1]

    for i in range(0,m-1):
        s -= ll[i+1][0]*ll[i][1]

    s += ll[-1][0]*ll[0][1]-ll[-1][1]*ll[0][0]
    ret = abs(s/2)
    if ret==int(ret):
        print(int(ret))
    else:
        print(ret)