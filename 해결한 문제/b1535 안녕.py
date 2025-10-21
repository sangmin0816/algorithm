# 전형적인 배낭 문제
import sys
input = sys.stdin.readline

N = int(input())

health = list(map(int, input().split(' ')))
happy = list(map(int, input().split(' ')))

dp = [[0 for i in range(100)] for i in range(N+1)]

for i in range(1, N+1):
    for j in range(1, 100):
        if j < health[i-1]:
            dp[i][j] = dp[i-1][j]
        else:
            dp[i][j] = max(happy[i-1]+dp[i-1][j-health[i-1]], dp[i-1][j])

print(dp[N][-1])