unit = [1, 1000, 12, 3, 22, 10, 8, 3]
name = ["th", "in", "ft", "yd", "ch", "fur", "mi", "lea"]
d = {"thou": "th",
     "inch": "in",
     "foot": "ft",
     "yard": "yd",
     "chain": "ch",
     "furlong": "fur",
     "mile": "mi",
     "league": "lea"}

l = list(str.split(input(), " "))
v = int(l[0])
unit1 = l[1]
unit2 = l[3]

if len(unit1) > 3:
     unit1 = d[unit1]
if len(unit2) > 3:
     unit2 = d[unit2]

idx1 = name.index(unit1)
idx2 = name.index(unit2)

if idx1 < idx2:
     s = 1
     for i in range(idx1+1, idx2+1):
         s /= unit[i]
     print(s*v)
else:
     s = 1
     for i in range(idx2+1, idx1 + 1):
          s *= unit[i]
     print(s*v)