import sys
import math
input = sys.stdin.readline

N = int(input())
fibb_similar = [0, 1, 1, 1, 2, 3, 4, 6, 9, 13, 19]

if len(fibb_similar) != N+1:
   for i in range(len(fibb_similar), N+1):
      fibb_similar.append(fibb_similar[i-1]+fibb_similar[i-3])

print(fibb_similar[N])