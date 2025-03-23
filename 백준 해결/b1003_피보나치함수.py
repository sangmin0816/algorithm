import sys
input = sys.stdin.readline


dp = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597]
N = int(input())

for n in range(len(dp), N+1):
   dp.append(dp[-1]+dp[-2])

print(dp[N])