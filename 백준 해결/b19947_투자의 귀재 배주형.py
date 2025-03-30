import sys
import math
input = sys.stdin.readline

H, Y = map(int, input().split(' '))
ans = [H for y in range(Y+1)]

for y in range(1, Y+1):
   if y >= 1:
      ans[y] = math.floor(ans[y-1]*1.05)
   if y >= 3:
      ans[y] = max(ans[y], math.floor(ans[y-3]*1.20))
   if y >= 5:
      ans[y] = max(ans[y], math.floor(ans[y-5]*1.35))

print(ans[Y])