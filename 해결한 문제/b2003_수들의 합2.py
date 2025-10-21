import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))
arr = list(map(int, input().split(' ')))
ans = 0

start = 0
end = 0
total = arr[start]

while end < N and start < N: 
    if total == M:
        ans += 1
    if total <= M and end+1 < N :
        end += 1
        total += arr[end]
    else :
        total -= arr[start]
        start += 1
    

print(ans)