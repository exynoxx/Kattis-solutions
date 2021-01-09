ik = input()
l = str.split(ik, " ")

a = l[0][::-1]
b = l[1][::-1]

if int(a) > int(b):
    print(a)
else:
    print(b)

