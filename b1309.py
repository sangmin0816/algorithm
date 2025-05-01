import sys
input = sys.stdin.readline

N = int(input())
dp = [3 for i in range(N)]

for i in range(1, N):
   dp[i] = dp[i]