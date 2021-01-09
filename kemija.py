s = input()

#n = "nicholas"
#print(n[4:][:-3])

length = len(s)
i = 0

while i < length:
    c = s[i]
    if c == "a" or c == "e" or c == "i" or c == "o" or c == "u":
        s = s[:i] + s[i+2:]
        length-=2
    i+=1

print(s)
