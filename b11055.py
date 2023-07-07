import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))

dp = [0 for n in range(N)]
dp[0] = arr[0]

for i in range(1, N):
    for j in range(i):
        if arr[i]>=arr[j]:
            dp[i] = max(dp[i], dp[j]+arr[i])

print(max(dp))