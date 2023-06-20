import sys

sum = 0

total = int(input())
count = int(input()) 
for i in range(count):
    a, b = map(int, sys.stdin.readline().split())
    sum += a*b

if total == sum:
    print("Yes")
else:
    print("No")
