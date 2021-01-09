from collections import deque


def solve():
    BAPC = input()
    n = int(input())
    line = input()
    l = deque(map(int, line[1: - 1].split(","))) if n > 0 else deque()

    forward = True
    for e in BAPC:
        if e == "R":
            forward = not forward
        else:
            if len(l) == 0:
                print("error")
                return
            if forward:
                l.popleft()
            else:
                l.pop()
    print("[",end="")
    if forward:
        while len(l) > 0:
            print(l.popleft(), end="")
            if len(l) != 0:
                print(",", end="")
    else:
        while len(l) > 0:
            print(l.pop(), end="")
            if len(l) != 0:
                print(",", end="")
    print("]")


t = int(input())
for _ in range(t):
    solve()
