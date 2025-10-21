import sys
input = sys.stdin.readline

R, C, W = map(int, input().split(' '))

pascal = [[1 for i in range(30)] for j in range(30)]
for i in range(2, 30):
   for j in range(1, i):
      pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1]

ans = 0
for i in range(1, W+1):
   for j in range(i):
      ans += pascal[R+i-2][C+j-1]

print(ans)