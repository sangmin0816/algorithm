import sys
input = sys.stdin.readline

T, X = map(int, input().split(' '))
N = int(input())

flag = True
for n in range(N):
   K = int(input())
   arr = list(map(int, input().split(' ')))
   if X not in arr:
      flag = False
if(flag):
   print("YES")
else:
   print("NO")