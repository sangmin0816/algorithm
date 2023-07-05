import sys
input = sys.stdin.readline

N = int(input())
arr = [0, 1, 3, 5, 8]

for n in range(5, N+1):
    if n%2==0:
        arr.append(arr[n-1]+arr[n-2])
    else:
        arr.append(arr[n-1]*(n//2+1)-1)

print(arr)