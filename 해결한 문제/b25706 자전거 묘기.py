import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))

dp = [1 for i in range(N)]

for i in range(N-2, -1, -1):
    if arr[i]>0:
        if arr[i]+i+1<N:
            dp[i]=dp[arr[i]+i+1]+1
    else:
        dp[i]=dp[i+1]+1

for d in dp:
    print(d, end=' ')