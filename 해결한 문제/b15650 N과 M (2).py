from itertools import combinations
import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))
N_arr = [i+1 for i in range(N)]

for comb in combinations(N_arr, M):
    for i in comb:
        print(i, end=' ')
    print()