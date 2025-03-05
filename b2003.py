import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))
arr = list(map(int, input().split(' ')))
ans = 0
temp = [0 for n in range(N+1)]

for i in range(0, N-1):
    for j in range(i, N):
        temp[j+1] = temp[j]+arr[j]-temp[i]
        if temp[j+1]==M:
            ans+=1
    print(temp)

print(ans)