
while True:
    n = int(input())
    if n == -1:
        break
    arr = []

    for i in range(n):
        r = list(map(lambda x: int(x), str.split(input(), " ")))
        arr.append(r)

    visited = [1] * n

    for i in range(n):
        if visited[i] == 0:
            continue
        for j, k in ((w1, w2) for w1 in range(n) for w2 in range(n)):
            if j == k:
                continue

            if arr[i][j] == 1 and arr[j][k] == 1 and arr[k][i] == 1:
                visited[i] = 0
                visited[j] = 0
                visited[k] = 0
    for i in range(n):
        if visited[i] == 1:
            print(i, end=" ")
    print("")

