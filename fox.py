import string
from collections import defaultdict

n = int(input())
for i in range(n):
    txt = input().lower()
    d = defaultdict(int)
    for c in txt:
        d[c] += 1
    final = ""
    for c in list(string.ascii_lowercase):
        if d[c] == 0:
            final += c
    if final != "":
        print("missing ", final)
    else:
        print("pangram")