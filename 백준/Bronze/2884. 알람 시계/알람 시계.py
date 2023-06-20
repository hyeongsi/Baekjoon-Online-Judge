hour, minute = map(int, input().split())

time = hour * 60 + minute - 45
if time < 0:
    time = 1440 + time

print(time//60, time%60)
