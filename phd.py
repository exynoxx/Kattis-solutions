n = int(input())
for i in range(0,n):
    inn = input()
    if inn == "P=NP":
        print("skipped")
    else:
        print(eval(inn))