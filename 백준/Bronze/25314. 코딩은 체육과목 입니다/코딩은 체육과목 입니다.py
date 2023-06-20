import sys

byte = int(sys.stdin.readline().rstrip())

if byte//4 >0:
    print("long " * (byte//4), end='')

print("int")
