def BellmanFord(n, edges, src):
    dist = [10000001] * n
    dist[src] = 0

    for _ in range(n - 1):
        for u, v, w in edges:
            if dist[u] != 10000001 and dist[u] + w < dist[v]:
                dist[v] = dist[u] + w

    for _ in range(n - 1):
        for u, v, w in edges:
            if dist[u] == -30000001:
                dist[v] = -30000001
            elif dist[u] != 10000001 and dist[u] + w < dist[v]:
                dist[v] = -30000001

    return dist


while True:
    n, m, q, s = list(map(lambda x: int(x), str.split(input(), " ")))
    if n == 0:
        break
    edges = []
    for _ in range(m):
        u, v, w = list(map(lambda x: int(x), str.split(input(), " ")))
        edges.append((u, v, w))

    dist = BellmanFord(n, edges, s)
    for _ in range(q):
        qq = int(input())
        if dist[qq] == 10000001:
            print("Impossible")
        else:
            if dist[qq] == -30000001 or dist[s] == -30000001:
                print("-Infinity")
            else:
                print(dist[qq])
