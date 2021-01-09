import heapq

h,w = list(map(lambda x: int(x), str.split(input(), " ")))
grid = []
for j in range(h):
    l = list(map(lambda x: int(x), str.split(input(), " ")))
    grid.append(l)

x, y = list(map(lambda x: int(x), str.split(input(), " ")))

flow = {}
x-=1
y-=1
q = []
heapq.heappush(q,(grid[x][y],x,y))
flow[(x,y)] = grid[x][y]
visited = set()
idx = [-1,0,1]

while q:
    d,x,y = heapq.heappop(q)

    if (x,y) in visited:
        continue

    visited.add((x, y))

    for i in idx:
        for j in idx:
            dx = x+i
            dy = y+j
            if (i == 0 and j == 0) or dx < 0 or dx >= h or dy < 0 or dy >= w or grid[dx][dy] >= 0:
                continue

            newd = max(d,grid[dx][dy])
            if newd < flow.get((dx, dy), 10000000):
                flow[(dx, dy)] = newd
                heapq.heappush(q, (newd, dx, dy))

print(-sum(flow.values()))