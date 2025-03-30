import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))

dp = [0 for n in range(N)]

max_num = 0
for i in range(1, N):
   if arr[i] > arr[i-1]:
      for j in range(i):
         dp[i] = max(dp[i-1], arr[i]-arr[j])
   else:
      dp[i] = dp[i-1]

print(dp)
