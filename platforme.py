l = sorted([tuple(map(int, input().split(" "))) for i in range(int(input()))],key=lambda x:x[0])
print(sum([2*yy - max([y[0] for y in l if y[0] < yy and y[1] <= x1 < y[2]],default=0) - max([y[0] for y in l if y[0] < yy and y[1] < x2 <= y[2]],default=0) for yy,x1,x2 in l]))