import sys
input = sys.stdin.readline

N = int(input())
n = 0

count = 666
while n!=N:
    if str(count).count('666')>=1:
        n+=1
    count+=1

print(count-1)