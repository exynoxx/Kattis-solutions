
inf = 1000000000


def floydWarshall(edges, n):
    dist = [[inf for i in range(n)] for j in range(n)]
    for u, v, w in edges:
        dist[u][v] = min(dist[u][v], w)

    for i in range(n):
        dist[i][i] = 0

    for k in range(n):
        for i in range(n):
            for j in range(n):
                if dist[i][k] == inf or dist[k][j] == inf:
                    continue
                dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j])

    for k in range(n):
        if dist[k][k] >= 0:
            continue
        for i in range(n):
            for j in range(n):
                if dist[i][k] != inf and dist[k][j] != inf:
                    dist[i][j] = -inf

    return dist


while True:
    n, m, q = list(map(int, input().split()))

    if n == 0:
        break

    edges = []
    for _ in range(m):
        u, v, w = list(map(int, input().split()))
        edges.append((u, v, w))

    dist = floydWarshall(edges, n)
    for _ in range(q):
        s, t = list(map(int, input().split()))
        if dist[s][t] == inf:
            print("Impossible")
        elif dist[s][t] == -inf:
            print("-Infinity")
        else:
            print(dist[s][t])
    print()
