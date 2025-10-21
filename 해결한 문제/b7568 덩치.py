# 알고보면 쉬운데, 문제가 더럽게 이해 안 가는 문제였다.
# 이렇게 상식에 어긋나는 문제 정말 싫다.

import sys
input = sys.stdin.readline

N = int(input())
arr = list()

for n in range(N):
    weight, height = map(int, input().split(' '))
    arr.append([n, weight, height, 0])

arr.append([51, 201, 201, 0])
arr.sort(key=lambda x:(-x[1], -x[2]))

for i in range(1, N+1):
    rank = 0
    for j in range(i):
        if arr[j][1] > arr[i][1] and arr[j][2] > arr[i][2]:
            rank += 1
    arr[i][3] = rank

arr.sort(key=lambda x:x[0])
arr.pop()

for a in arr:
    print(a[3], end=' ')