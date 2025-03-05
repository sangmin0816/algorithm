import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))

maximum = 0
min_i = 0
max_i = 0

for i in range(N):
    for j in range(i):
        temp = arr[i]-arr[j]
        if maximum<temp:
            maximum = temp
            if arr[j]<arr[min_i]:
                min_i = j
                break
    print(maximum, end=' ')