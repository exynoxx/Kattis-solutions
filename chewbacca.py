from math import floor

n,k,q = map(lambda x:int(x), str.split(input()," "))

for case in range(0, q):
    x, y = map(lambda x:int(x), str.split(input()," "))

    count = 0
    daddy_x = x
    daddy_y = y
    while daddy_x != daddy_y:
        if daddy_x > daddy_y:
            daddy_x = floor(((daddy_x-2)/k)+1)
        else:
            daddy_y = floor(((daddy_y-2)/k)+1)

        count += 1
    print(count)


