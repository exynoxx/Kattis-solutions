def transpose(x):
    ret = [[0] * 4 for i in range(4)]

    for i in range(4):
        for j in range(4):
            ret[j][i] = x[i][j]
    return ret


def mirror(x):
    ret = [[0] * 4 for i in range(4)]
    for i in range(4):
        for j in range(4):
            ret[i][j] = x[i][3 - j]
    return ret


matrix = [[0] * 4 for i in range(4)]
for i in range(4):
    l = list(map(int, input().split()))
    for j in range(4):
        matrix[i][j] = l[j]

direction = int(input())
if direction == 1:
    matrix = transpose(matrix)
elif direction == 2:
    # right
    matrix = mirror(matrix)
elif direction == 3:
    matrix = mirror(transpose(matrix))

for i in range(4):
    sett = []
    for j in range(4):
        if matrix[i][j] > 0:
            sett.append(matrix[i][j])
    for j in range(4):
        if j < len(sett):
            matrix[i][j] = sett[j]
        else:
            matrix[i][j] = 0

    if matrix[i][0] == matrix[i][1] and matrix[i][2] == matrix[i][3]:
        # __ __
        matrix[i][0] *= 2
        matrix[i][1] = matrix[i][2] * 2
        matrix[i][2] = 0
        matrix[i][3] = 0
    elif matrix[i][0] == matrix[i][1] or matrix[i][0] == matrix[i][1] == matrix[i][2]:
        # __** or ___*
        matrix[i][0] *= 2
        matrix[i][1] = matrix[i][2]
        matrix[i][2] = matrix[i][3]
        matrix[i][3] = 0
    elif matrix[i][1] == matrix[i][2] == matrix[i][3] or matrix[i][1] == matrix[i][2]:
        # *___ or *__*
        matrix[i][1] *= 2
        matrix[i][2] = matrix[i][3]
        matrix[i][3] = 0
    elif matrix[i][0] == matrix[i][1]:
        # __**
        matrix[i][0] *= 2
        matrix[i][1] = matrix[i][2]
        matrix[i][2] = matrix[i][3]
        matrix[i][3] = 0
    elif matrix[i][2] == matrix[i][3]:
        # **__
        matrix[i][2] *= 2
        matrix[i][3] = 0


if direction == 1:
    matrix = transpose(matrix)
elif direction == 2:
    # right
    matrix = mirror(matrix)
elif direction == 3:
    matrix = transpose(mirror(matrix))

for i in range(4):
    for j in range(4):
        print(matrix[i][j], end=" ")
    print()
