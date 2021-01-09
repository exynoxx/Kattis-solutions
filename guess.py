from math import floor

l = 1
r = 1000
while True:
    x = floor((r + l) / 2)
    print(x)
    res = input()
    if res == "lower":
        r = x-1
    elif res == "higher":
        l = x+1
    else:
        break