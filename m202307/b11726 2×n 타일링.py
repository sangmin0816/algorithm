import sys
input = sys.stdin.readline

N = int(input())

dp = [1, 2, 3]

for n in range(3, N):
    dp.append((dp[n-2]+dp[n-1])%10007)

print(dp[N-1])