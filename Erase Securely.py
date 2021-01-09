n = int(input())
num1 = input()
num2 = input()

def main ():
    if (len(num1) != len(num2)):
        print("Deletion failed")
    else:
        if (n % 2 == 0):
            if (int(num1) == int(num2)):
                print("Deletion succeeded")
                return
            else:
                print("Deletion failed")
                return
        else:
            i = 0
            while i < len(num1):
                if num1[i] == num2[i]:
                    print("Deletion failed")
                    return
                i+=1
            print("Deletion succeeded")
            return

main()