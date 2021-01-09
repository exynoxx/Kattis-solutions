n1 = int(input())
n2 = int(input())

if (n2-n1)%360 <= (n1-n2)%360:
    print((n2-n1)%360)
else:
    print(-((n1 - n2) % 360))