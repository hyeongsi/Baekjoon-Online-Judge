from collections import Counter
diceNum = list(map(int, input().split()))

count = Counter(diceNum)
result = 0

if len(count.keys()) == 1:
    result = 10000 + diceNum[0] * 1000
elif len(count.keys()) == 2:
    if count[max(count.keys())] == 1:
        result = 1000 + min(count.keys()) * 100
    else:
        result = 1000 + max(count.keys()) * 100
else:
    result = max(diceNum) * 100  

print(result)