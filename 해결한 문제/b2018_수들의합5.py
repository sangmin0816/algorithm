import sys
input = sys.stdin.readline

N = int(input())

ans = 1
start = 1
total = start

for end in range(2, N):
    total += end
    while(total>N):
        total -= start
        start += 1
    if(total==N):
        ans+=1
        total -= start
        start += 1
        

print(ans)