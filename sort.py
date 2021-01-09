from collections import defaultdict

n,c = map(lambda x:int(x), str.split(input()," "))

l = list(map(lambda x:int(x), str.split(input()," ")))
d = defaultdict(int)
for e in l:
    d[e] += 1

g = sorted(d.items(),key=lambda x: x[1],reverse=True)
for k,v in g:
    print(''.join([str(k)+" " for i in range(v)]), end="")


