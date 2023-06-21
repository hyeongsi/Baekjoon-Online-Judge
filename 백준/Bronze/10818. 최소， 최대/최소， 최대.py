import sys

N = int(input())
input = list(map(int, sys.stdin.readline().split()))

print(min(input), max(input))