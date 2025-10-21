from collections import deque
import sys
input = sys.stdin.readline

move_x = [1, -1, 0, 0]
move_y = [0, 0, 1, -1]

N, M = map(int, input().split(' '))
maze = [list(map(int, input().rstrip())) for n in range(N)]

def bfs(start, N, M, maze):
    visited = [[False for m in range(M)] for n in range(N)]
    que = [deque([start])]
    cnt = 1

    while que:
        current = que.pop()
        temp = deque()
        while current:
            nx, ny = current.popleft()
            if nx==N-1 and ny==M-1:
                return cnt
            if 0<=nx<N and 0<=ny<M:
                if not visited[nx][ny] and maze[nx][ny]:
                    visited[nx][ny] = True
                    for i in range(4):
                        temp.append([nx+move_x[i], ny+move_y[i]])
        
        que.append(temp)
        cnt += 1


print(bfs([0, 0], N, M, maze))
