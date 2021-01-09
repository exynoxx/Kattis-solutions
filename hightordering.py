#t = int(input())

def insertionSort(arr):
    steps = 0

    # Traverse through 1 to len(arr)
    for i in range(1, len(arr)):

        key = arr[i]

        # Move elements of arr[0..i-1], that are
        # greater than key, to one position ahead
        # of their current position
        j = i - 1
        while j >= 0 and key < arr[j]:
            arr[j + 1] = arr[j]
            j -= 1
            steps +=1
        arr[j + 1] = key
    return steps

t = int(input())
for _ in range(t):
    ll = list(map(lambda x: int(x), str.split(input(), " ")))

    k = ll[0]
    line = ll[1:]
    print(k, insertionSort(line))