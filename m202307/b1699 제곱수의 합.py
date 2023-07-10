# python으로는 시간 초과가 난다. 어떻게 하면 시간을 줄일 수 있을까?
import sys
input = sys.stdin.readline
INF = float('inf')

N = int(input())
dp = [INF for n in range(N+3)]
dp[1] = 1
dp[2] = 2
dp[3] = 3

sqr = []

for n in range(1, int(N**(1/2)+1)):
    dp[n**2] = 1
    sqr.append(n**2)

for i in range(4, N+1):
    for s in sqr:
        if s<i:
            dp[i] = min(dp[i], dp[s]+dp[i-s])

print(dp[N])