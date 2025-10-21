import sys
input = sys.stdin.readline
INF = float('inf')

N = int(input())
coins = [1, 2, 5, 7]
dp = [INF for i in range(N+1)]
dp[0] = 0

for n in range(1, N+1):
    for c in coins:
        if n>=c:
            dp[n] = min(dp[n-c]+1, dp[n-1]+1, dp[n])

print(dp[N])