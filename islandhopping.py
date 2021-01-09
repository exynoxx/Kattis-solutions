import math


def minKey(key, mstSet, n):
    return min(filter(lambda x: not mstSet[x], range(n)), key=lambda v: key[v])


def primMST(graph, n):
    key = [100000] * n
    key[0] = 0
    mstSet = [False] * n
    parent = [None] * n

    for _ in range(n):
        u = minKey(key, mstSet, n)
        mstSet[u] = True
        for v in range(n):
            if 0 < graph[u][v] < key[v] and not mstSet[v]:
                parent[v] = u
                key[v] = graph[u][v]

    return sum(graph[i][parent[i]] for i in range(1, n))

def euclid(x1,x2,y1,y2):
    return math.sqrt((x1-x2)**2 + (y1-y2)**2)

for _ in range(int(input())):
    m = int(input())
    unique = set()
    inn=[]
    for _ in range(m):
        h, v = map(float, input().split())
        inn.append((h,v))
    graph = [[float("inf") for _ in range(m)] for _ in range(m)]
    for i in range(m):
        for j in range(m):
            graph[i][j] = euclid(inn[i][0],inn[j][0],inn[i][1],inn[j][1])

    print(primMST(graph,m))

