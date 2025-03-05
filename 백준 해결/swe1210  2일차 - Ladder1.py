mx = [0, 0, -1]
my = [1, -1, 0]

def dfs(start, ladders):
    visited = [[False for i in range(100)] for j in range(100)]
    stack = [start]

    while stack:
        nx, ny = stack.pop()
        if nx==0 and ladders[nx][ny]==1:
            return ny
        if not visited[nx][ny]:
            visited[nx][ny] = True
            for i in range(3):
                sx = nx+mx[i]
                sy = ny+my[i]
                if 0<=sx<100 and 0<=sy<100 and ladders[sx][sy]!=0:
                    if not visited[sx][sy]:
                        stack.append([sx, sy])
                        break




for _ in range(10):
    t = int(input())
    ladders = [list(map(int, input().rstrip().split(' '))) for i in range(100)]

    entrance = 0
    for i in range(100):
        if ladders[99][i]==2:
            exit = [99, i]
            break
    
    ans = dfs(exit, ladders)

    print("#%d"%(t), ans)