import math
A, N = map(float, input().split())
print("Diablo is happy!" if math.sqrt(4 * math.pi * A) < N else "Need more materials!")