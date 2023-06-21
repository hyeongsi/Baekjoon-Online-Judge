A, X = map(int, input().split())

seq = list(map(int, input().split()))
for i in seq:
    if i < X:
        print(i, end=" ")