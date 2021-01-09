n = int(input())
l = list(map(lambda x: int(x),str.split(input()," ")))

out = [l[0]]
cur = l[0]
for e in l:
    if e > cur:
        cur = e
        out.append(e)

print(len(out))
for e in out:
    print(e, end=" ")
print("")