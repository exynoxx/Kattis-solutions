n = int(input())
l = list(sorted(map(int, input().split())))
A, B = map(int, input().split())
nums = [((l[i + 1] + l[i]) // 2) + (((l[i + 1] + l[i]) // 2 + 1) % 2) for i in range(n - 1)]
print(max((min(abs(l[i] - A+((A+1)%2)) for i in range(n)),A+((A+1)%2)),(min(abs(l[i] - B-((B+1)%2)) for i in range(n)),B-((B+1)%2)),(min(abs(l[i] - nums[max(range(n - 1), key=lambda i: abs(nums[i] - l[i]) if A+((A+1)%2) <= nums[i] <= B-((B+1)%2) else -1)]) for i in range(n)),nums[max(range(n - 1), key=lambda i: abs(nums[i] - l[i]) if A+((A+1)%2) <= nums[i] <= B-((B+1)%2) else -1)]))[1])