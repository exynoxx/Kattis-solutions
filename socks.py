s,c,k = map(lambda x: int(x), str.split(input()," "))
l = list(map(lambda x: int(x), str.split(input()," ")))
l.sort()
current_min_color = l[0]
current_count = 0
ret = 1
for i in range(s):
    e = l[i]

    # full? new
    if current_count == c or abs(current_min_color - e) > k:
        current_min_color = e
        current_count = 1
        ret += 1

    #fit? add
    elif abs(current_min_color-e) <= k and current_count < c:
        current_count+=1


print(ret)