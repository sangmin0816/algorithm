import sys
input = sys.stdin.readline

N = int(input())
arr = [0]
arr.extend(list(map(int, input().split(' '))))
dp = [0 for n in range(N+1)]

for i in range(1, N+1):
    dp[i] = arr[i]
    for j in range(i//2+1):
        dp[i] = max(dp[i], dp[j]+dp[i-j])

print(dp[-1])