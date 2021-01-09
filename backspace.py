l = input()
out = ""
num = 0
for c in l[::-1]:
    if c == '<':
        num+=1
    else:
        if num > 0:
            num -=1
        else:
            out += c
print(out[::-1])
