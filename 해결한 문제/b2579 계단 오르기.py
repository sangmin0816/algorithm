import sys
input = sys.stdin.readline

N = int(input())
stairs = list()

for n in range(N):
    stairs.append(int(input()))

dp = [0 for n in range(N)]

dp[0] = stairs[0]
if N>1:
    dp[1] = max(stairs[0]+stairs[1], stairs[1])
if N>2:
    dp[2] = max(dp[0], stairs[1]) + stairs[2]

for i in range(3, N):
    dp[i] = max(dp[i-2], dp[i-3]+stairs[i-1]) + stairs[i]

print(dp[-1])