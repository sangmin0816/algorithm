import sys
sys.setrecursionlimit(10**6)

input = sys.stdin.readline

M, N, H = map(int, input().split(' '))
arr = [[] for h in range(H)]

for h in range(H):
    arr[h] = [list(map(int, input().split(' '))) for n in range(N)]

tomatoes = list()

for h in range(H):
    for n in range(N):
        for m in range(M):
            if arr[h][n][m]==1:
                tomatoes.append([h, n, m])

xm = [1, -1, 0, 0, 0, 0]
ym = [0, 0, 1, -1, 0, 0]
zm = [0, 0, 0, 0, 1, -1]

def dfs(arr, tomatoes, visited, N, M, H, cnt):
    if not len(tomatoes):
        return cnt
    
    stack = list()

    while tomatoes:
        nh, nn, nm = tomatoes.pop()
        if not visited[nh][nn][nm]:
            visited[nh][nn][nm] = True

            for i in range(6):
                sx = nn + xm[i]
                sy = nm + ym[i]
                sz = nh + zm[i]
                if 0<=sx<N and 0<=sy<M and 0<=sz<H:
                    if arr[sz][sx][sy] == 0:
                        arr[sz][sx][sy] = 1
                        stack.append([sz, sx, sy])
    
    return dfs(arr, stack, visited, N, M, H, cnt+1)

visited = [[[False for m in range(M)] for n in range(N)] for h in range(H)]
ans = dfs(arr, tomatoes, visited, N, M, H, -1)

flag = 0

for h in range(H):
    for n in range(N):
        for m in range(M):
            if arr[h][n][m]==0:
                print(-1)
                sys.exit(0)

print(ans)