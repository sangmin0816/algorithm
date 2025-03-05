from itertools import combinations
import sys
input = sys.stdin.readline

while True:
    arr = list(map(int, input().split(' ')))
    if arr[0]==0:
        break
    
    K = arr[0]
    arr = arr[1:]

    for comb in combinations(arr, 6):
        for c in comb:
            print(c, end=' ')
        print()
    
    print()