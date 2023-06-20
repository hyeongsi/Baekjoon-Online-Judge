hour, minute = map(int, input().split())
cookTime = int(input())

time = hour * 60 + minute + cookTime
if time >= 1440:
    time = time - 1440

print(time//60, time%60)