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


t = int(input())
for _ in range(t):
    M, n = map(int, input().split())
    graph = [[0] * n for i in range(n)]
    for _ in range(n * (n - 1) // 2):
        u, v, w = map(int, input().split())
        graph[u][v] = w
        graph[v][u] = w

    s = primMST(graph, n)
    if M - s - n >= 0:
        print("yes")
    else:
        print("no")
