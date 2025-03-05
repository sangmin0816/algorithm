import  sys
input = sys.stdin.readline

dp = [0, 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12]

for i in range(11, 101):
    dp.append(dp[i]+dp[i-4])

T = int(input())
for t in range(T):
    N = int(input())
    print(dp[N])