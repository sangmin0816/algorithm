from collections import deque
mx = [1, -1, 0, 0]
my = [0, 0, 1, -1]

def bfs(start, end, maze):
    visited = [[False for i in range(16)] for j in range(16)]
    que = deque([start])

    while que:
        nx, ny = que.popleft()
        if [nx, ny] == end:
            return 1
        if 0<=nx<16 and 0<=ny<16:
            if not visited[nx][ny] and maze[nx][ny]!='1':
                visited[nx][ny] = True
                for i in range(4):
                    que.append([nx+mx[i], ny+my[i]])
    return 0


for _ in range(10):
    t = int(input())

    maze = [list(input().rstrip()) for i in range(16)]
    entrance = list()

    for i in range(16):
        for j in range(16):
            if maze[i][j]>'1':
                entrance.append([i, j])

    ans = bfs(entrance[0], entrance[1], maze)
    print("#%d"%(t), ans)