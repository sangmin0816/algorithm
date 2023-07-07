import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))
arr = [list(input().rstrip()) for n in range(N)]

def dfs(nx, ny, arr, N, M, visited):
    cnt = 0
    if arr[nx][ny]=='.':
        visited[nx][ny]=True
        xm = [1, -1, 0, 0, -1, 1]
        ym = [0, 0, 1, -1]
        if nx%2==0:
            ym.extend([-1, -1])
        else:
            ym.extend([1, 1])
        for i in range(6):
            sx = nx+xm[i]
            sy = ny+ym[i]
            if 0<=sx<N and 0<=sy<M:
                if arr[sx][sy]=='#':
                    cnt+=1                 
    return cnt

visited = [[False for m in range(M)] for n in range(N)]
ans = 0
for n in range(N):
    for m in range(M):
        if not visited[n][m]:
            ans += dfs(n, m, arr, N, M, visited)

print(ans)        