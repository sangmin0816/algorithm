import sys
input = sys.stdin.readline

N, K = map(int, input().split(' '))
arr = [int(input()) for n in range(N)]
dp = [100001 for k in range(K+1)]
dp[0] = 0

for k in range(1, K+1):
    for n in range(N):
        if arr[n]<=k:
            dp[k] = min(dp[k], 1+dp[k-arr[n]])
        
if dp[-1]>=100001:
    print(-1)
else:
    print(dp[-1])