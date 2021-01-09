n, s = list(map(lambda x: int(x), str.split(input(), " ")))
nums = list(map(lambda x: int(x), str.split(input(), " ")))

# 1 2 5 6 8 9 0
# 3 4 7 not

d = {"1": "1", "2": "2", "5": "5", "6": "9", "8": "8", "9": "6", "0": "0"}
def flip(x):
    e = str(x)
    legal = True
    rotation = ""
    for c in e:
        if c == '3' or c == '4' or c == '7':
            legal = False
            break
        else:
            rotation += d[c]

    if legal:
        return int(rotation[::-1])
    else:
        return -1

inv = list(map(lambda x: flip(x),nums))

yes = False
for i in range(0,len(nums)-1):
    for j in range(i,len(nums)):
        if i == j:
            continue
        if nums[i] + nums[j] == s:
            yes = True
            break
        if inv[i] >= 0:
            if inv[i] + nums[j] == s:
                yes = True
                break
            if inv[j] >= 0:
                if nums[i] + inv[j] == s:
                    yes = True
                    break
                if inv[i] + inv[j] == s:
                    yes = True
                    break
    if yes == True:
        break

if yes == True:
    print("YES")
else:
    print("NO")