n = 0
res = []
while True:
    n = int (input())
    if n == 0:
        break

    current_width = 0
    max_width = 0
    current_height = 0
    max_height = 0

    while True:
        inn = str.split(input(), " ")
        a = int(inn[0])
        b = int(inn[1])

        if a == -1 and b == -1:
            max_height += current_height
            s = str(max_width) + " x " + str(max_height)
            res.append(s)
            break

        if (current_width + a <= n):
            current_width += a
            max_width = max(current_width, max_width)
            current_height = max(current_height, b)
        else:
            max_height += current_height
            current_width = a
            current_height = b

for s in res:
    print(s)