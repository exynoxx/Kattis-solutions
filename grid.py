N, M = map(int, input().split(" "))
G = []
for _ in range(N):
    G.append(list(map(int, [char for char in input()])))

count = [[251000 for _ in range(M)] for _ in range(N)]


def bfs():
    queue = []
    queue.append((0, 0))
    count[0][0] = 0
    visited = {}

    while queue:
        x, y = queue.pop(0)
        k = G[x][y]
        visited[(x,y)] = True

        for (i, j) in [(x + k, y), (x - k, y), (x, y + k), (x, y - k)]:
            if i < 0 or i >= N or j < 0 or j >= M:
                continue

            if not visited.get((i,j),False) and count[x][y] + 1 <= count[i][j]:
                visited[(i, j)] = True
                queue.append((i, j))
                count[i][j] = count[x][y] + 1
                if (i, j) == (N-1, M-1):
                    return count[i][j]
    return -1

print(bfs())

