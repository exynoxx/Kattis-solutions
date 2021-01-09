import sys

sys.setrecursionlimit(1500)

n, m = list(map(lambda x: int(x), str.split(input(), " ")))

adj = [[] for i in range(n)]

s = 0
for _ in range(m):
    i, j = list(map(lambda x: int(x), str.split(input(), " ")))
    adj[i - 1].append(j-1)
    adj[j - 1].append(i-1)
    s = i-1

tt = 0


def containBridge(u, visited, parent, low, disc):
    global tt
    visited[u] = True
    disc[u] = tt
    low[u] = tt
    tt += 1

    for v in adj[u]:
        if not visited[v]:
            parent[v] = u
            r = containBridge(v, visited, parent, low, disc)
            if r:
                return True

            low[u] = min(low[u], low[v])

            if low[v] > disc[u]:
                return True

        elif v != parent[u]:
            low[u] = min(low[u], disc[v])

    return False


visited = set()
e = set()


def dfs(u):
    visited.add(u)
    for v in adj[u]:
        if (u, v) not in e and (v, u) not in e:
            e.add((u, v))
        if v not in visited:
            dfs(v)



#does graph contain bridge? yes: answer is NO
#No bridge: find "strong orientation" with DFS
def solve():
    visited = [False] * n
    parent = [-1] * n
    low = [10000] * n
    disc = [10000] * n
    if containBridge(s, visited, parent, low, disc):
        print("NO")
        return


    print("YES")
    dfs(s)
    for u, v in e:
        print(u + 1, v + 1)

solve()
