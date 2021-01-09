def compare(x,y):
    #x > y=true
    i = 0
    while i < len(x)-1 and x[i].lower() == y[i].lower():
        i+=1

    b = x[i].lower() > y[i].lower()
    return b



def sort(nums):
    # Start on the second element as we assume the first element is sorted
    for i in range(1, len(nums)):
        item_to_insert = nums[i]
        # And keep a reference of the index of the previous element
        j = i - 1
        # Move all items of the sorted segment forward if they are larger than
        # the item to insert
        while j >= 0 and compare(nums[j],item_to_insert):
            nums[j + 1] = nums[j]
            j -= 1
        # Insert the item
        nums[j + 1] = item_to_insert


while True:
    r,c = map(lambda x: int(x), str.split(input()," "))

    if c == 0 and r == 0:
        break

    matrix = [[] for i in range(c)]
    for rr in range(r):
        s = input()
        for i in range(0,c):
            matrix[i].append(s[i])
    sort(matrix)

    for i in range(r):
        for j in range(c):
            print(matrix[j][i],end="")
        print("")
    print("")


