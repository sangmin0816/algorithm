import sys
input = sys.stdin.readline

fibb = [1, 1, 2, 3, 5, 8]
T = int(input())

for t in range(0, T):
   N = int(input())
   if len(fibb)<N+1:
      for i in range(len(fibb), N+1):
         fibb.append(fibb[i-1]+fibb[i-2])
   print(fibb[N])