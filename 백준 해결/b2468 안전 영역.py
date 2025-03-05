import sys
input = sys.stdin.readline
mx = [1, -1, 0, 0]
my = [0, 0, 1, -1]

N = int(input())
arr = list()
setA = set([0])
for n in range(N):
    temp = list(map(int, input().split(' ')))
    arr.append(temp)
    setA = setA.union(set(temp))

def dfs(start, N, visited, arr, limit):
    stack = [start]

    while stack:
        nx, ny = stack.pop()
        if 0<=nx<N and 0<=ny<N:
            if not visited[nx][ny]:
                visited[nx][ny] = True
                if arr[nx][ny]>limit:
                    for i in range(4):
                        stack.append([nx+mx[i], ny+my[i]])

ans = list()
for limit in setA:
    visited = [[False for n in range(N)] for n in range(N)]
    cnt = 0
    for i in range(N):
        for j in range(N):
            if arr[i][j]>limit and not visited[i][j]:
                cnt+=1
                dfs([i, j], N, visited, arr, limit)
    
    ans.append(cnt)

print(max(ans))