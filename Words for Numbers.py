units = [
    "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
    "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
    "sixteen", "seventeen", "eighteen", "nineteen"]

tens = ["", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"]


def main ():
    string = input()
    result = []

    for idx, s in enumerate(str.split(string)):

        if str.isdigit(s):
            if int(s) <= 19:
                result.append(units[int(s)])
            else:
                k = int(s)
                if k%10 == 0:
                    result.append(tens[int(k/10)])
                else:
                    result.append(tens[int(k/10)] + "-" + units[int(k%10)])
            if idx == 0:
                result[0] = str.capitalize(result[0])
        else:
            result.append(s)
    print(" ".join(str(x) for x in result))

try:
    while True:
        main ()
except EOFError:
    print("")