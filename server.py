list = str.split(input(), " ")

n = int(list[0])
T = int(list[1])

list = str.split(input(), " ")

sum = 0

for i in range(0,n):
    if sum + int(list[i]) > T:
        print (i)
        break
    sum += int(list[i])

    if i == n-1:
        print(i+1)
