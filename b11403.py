# 11404 경로찾기 https://www.acmicpc.net/problem/11403
import sys

N = int(input())
arr = [list(map(int, input().split(' '))) for n in range(N)]

for i in range(N):
   for j in range(N):
      if i == j:
         continue
      if arr[i][j] == 1:
         cnt = 0
         a, b = i, j
         while cnt < N:
            temp = a
            a = b
            b = temp
            if(arr[a][b]==0):
               arr[a][b] = 1

for n in range(N):
   for m in range(N):
      print(arr[n][m], end= ' ')
   print()
      
      