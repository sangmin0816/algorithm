import sys
input = sys.stdin.readline

N = int(input())
boxes = list(map(int, input().split(' ')))
dp = [1]

for i in range(1, len(boxes)):
   max_box = 1
   for j in range(0, i):
      if boxes[j]<boxes[i]:
         max_box = max(max_box, dp[j]+1)
   dp.append(max_box)

print(max(dp))