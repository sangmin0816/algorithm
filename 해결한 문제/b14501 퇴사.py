import sys
input = sys.stdin.readline

N = int(input())
consulting = list()

dp = [0]*(N)

for n in range(N):
    T, P = map(int, input().split(' '))
    consulting.append([T, P])

for i in range(N):
    if consulting[i][0]+i<=N:
        dp[i] = consulting[i][1]
    temp = list()
    for j in range(i):
        if consulting[j][0]+j<=i:
            temp.append(dp[j])
    if temp:
        dp[i] += max(temp)

print(max(dp))