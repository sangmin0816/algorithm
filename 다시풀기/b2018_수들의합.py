import sys
input = sys.stdin.readline

N = int(input())

ans = 1
start = 1
end = 2

for i in range(1, (N//2)+1):
    sum = i + end
    while sum < N:
        end += 1
        sum += end
    if sum == N:
        ans += 1
    
    end = i+2

print(ans)