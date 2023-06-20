import sys

loop = int(sys.stdin.readline().rstrip())

for i in range(loop):
    a, b = map(int, sys.stdin.readline().rsplit())
    print(a + b)