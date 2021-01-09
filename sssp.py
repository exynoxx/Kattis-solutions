import heapq


def dijkstra(adj, n, start):
    dist = [30000001] * n
    dist[start] = 0
    visited = [False] * n
    queue = [(0, start)]
    # parent = [-1] * n

    while queue:
        _, current = heapq.heappop(queue)
        visited[current] = True

        for v, w in adj[current]:
            if visited[v]:
                continue
            new_dist = dist[current] + w

            if new_dist < dist[v]:
                dist[v] = new_dist
                # parent[v] = current
                heapq.heappush(queue, (new_dist, v))
    return dist

while True:
    n, m, q, s = list(map(lambda x: int(x), str.split(input(), " ")))
    if n == 0:
        break
    adj = [[] for i in range(n)]
    for _ in range(m):
        u, v, w = list(map(lambda x: int(x), str.split(input(), " ")))
        adj[u].append((v, w))

    dist = dijkstra(adj, n, s)
    for _ in range(q):
        qq = int(input())
        if dist[qq] == 30000001:
            print("impossible")
        else:
            print(dist[qq])