import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))

dp = [0 for i in range(N)]
dp[0] = arr[0]

for i in range(1, N):
    dp[i] = arr[i]
    if dp[i] < dp[i-1]+arr[i]:
        dp[i] += dp[i-1]

print(max(dp))