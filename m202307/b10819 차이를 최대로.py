from itertools import permutations
import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))
ans = []
for per in permutations(arr, N):
    total = 0
    for n in range(N-1):
        total+=abs(per[n]-per[n+1])
    ans.append(total)

print(max(ans))