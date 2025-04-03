import sys
input = sys.stdin.readline

N = int(input())
stock = list(map(int, input().split(' ')))

ans = []
for i in range(N-1, 0, -1):
   ans.append(stock[i] - min(stock[0:i]))

if ans:
   print(max(ans))
else:
   print(0)