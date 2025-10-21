import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))

dp = [0]
min_a = float("inf")
for i in range(1, N):
   if min_a > arr[i-1]:
      min_a = arr[i-1]
   dp.append(max(arr[i]-min_a, dp[i-1]))

for d in dp:
   print(d, end=' ')

# 기존에는 이중 반복문을 돌면서 가장 작은 값을 다시 빼려고 함
# 가장 작은 값도 기록해두면 굳이 반복문 돌 필요 없음음