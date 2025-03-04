import sys
input = sys.stdin.readline

N = int(input())
arr = [0, 1, 3, 5]

for n in range(3, N+1):
    if n%2==0:
        arr.append(arr[n-2]*n-1)
    else:
        arr.append(arr[n-1]*n-(n-1))

print(arr)
