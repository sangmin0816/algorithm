from itertools import permutations
import sys
input = sys.stdin.readline

N = int(input())
arr = [i+1 for i in range(N)]

for perm in permutations(arr, N):
    for i in perm:
        print(i, end=' ')
    print()