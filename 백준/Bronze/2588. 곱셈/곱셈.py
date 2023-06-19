a = int(input())
b = list(map(int, input()))

sum = 0
temp = 0
b = list(reversed(b))

for i in range(3):
    temp = a * b[i]
    print(temp)
    for j in range(i):
        temp *= 10
    sum += temp

print(sum)