int(input())
l = list(filter(lambda x: x!=0,map(int, input().split(" "))))
n = len(l)

def cul(l):
    ret = [l[0]]
    for i in range(1,len(l)):
        ret.append(ret[i-1]+l[i])
    return ret

base = [l[i]*(i+1) for i in range(n)]
baseone = [base[i] + l[i] for i in range(n)]
forward = cul(base)
backward = cul(baseone[::-1])[::-1]

print(max(forward[-1],backward[0],max(forward[i]+backward[i+1] for i in range(n-1))))



