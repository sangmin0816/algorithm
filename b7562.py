import sys
input = sys.stdin.readline

mx = [1, 1, -1, -1, 2, 2, -2, -2]
my = [2, -2, 2, -2, 1, -1, 1, -1]

def bfs(stack, fx, fy, N, visited, cnt):
    temp = []
    while stack:
        nx, ny = stack.pop()
        if nx==fx and ny==fy:
            return cnt
        visited[nx][ny] = True
        for i in range(8):
            sx = nx+mx[i]
            sy = ny+my[i]
            if 0<=sx<N and 0<=sy<N and not visited[sx][sy]:
                temp.append([sx, sy])
    if temp:
        return bfs(temp, fx, fy, N, visited, cnt+1)

T = int(input())
for t in range(T):
    N = int(input())
    nx, ny = map(int, input().split(' '))
    fx, fy = map(int, input().split(' '))
    cnt = 0
    if fx-nx<fy-ny:
        cnt+=fx//2
        fx-=cnt*2
        fy-=cnt
        cnt+=fy//2//2
        fy%=4
    else:
        cnt+=fy//2
        fy-=cnt*2
        fx-=cnt
        cnt+=fx//2//2
        fx%=4
    print(fx, fy)
    visited = [[False for n in range(N)] for n in range(N)]
    
    ans = bfs([[nx, ny]], fx, fy, N, visited, cnt)
    print(ans)
