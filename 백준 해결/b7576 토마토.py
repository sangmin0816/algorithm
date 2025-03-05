from collections import deque
import sys
input = sys.stdin.readline

M, N = map(int, input().split(' '))
tomatoes = [list(map(int, input().split(' '))) for n in range(N)]

move_x = [1, -1, 0, 0]
move_y = [0, 0, 1, -1]

ripen = []
for n in range(N):
    for m in range(M):
        if tomatoes[n][m]==1:
            ripen.append([n, m])

def bfs(ripen, N, M, tomatoes):
    visited = [[False for m in range(M)] for n in range(N)]
    cnt = -1

    while ripen:
        que = ripen.pop()
        temp = deque()
        while que:
            nx, ny = que.pop()
            if 0<=nx<N and 0<=ny<M and not visited[nx][ny]:
                visited[nx][ny] = True
                if tomatoes[nx][ny]!=-1:         
                    tomatoes[nx][ny] = 1
                    for i in range(4):
                        temp.append([nx+move_x[i], ny+move_y[i]])
        
        if len(temp):
            ripen.append(temp)
            cnt += 1
    
    return cnt

ans = bfs([ripen], N, M, tomatoes)
for t in tomatoes:
    if t.count(0):
        print(-1)
        sys.exit(0)

print(ans)