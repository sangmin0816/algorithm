import sys
input = sys.stdin.readline

x = [1, -1, 0, 0]
y = [0, 0, 1, -1]

def dfs(start, M, N, visited, cabbages):
    stack = [start]

    while stack:
        nx, ny = map(int, stack.pop())
        if 0<=nx<M and 0<=ny<N:
            if not visited[nx][ny] and [nx, ny] in cabbages:
                visited[nx][ny] = True
                for i in range(4):
                    stack.append([nx+x[i], ny+y[i]])

T = int(input())
for t in range(T):
    M, N, K = map(int, input().split(' '))
    cabbages = list()

    for k in range(K):
        cabbages.append(list(map(int, input().split(' '))))

    ans = 0
    visited = [[False for n in range(N)]for m in range(M)]
    for cx, cy in cabbages:
        if not visited[cx][cy]:
            ans+=1
            dfs([cx, cy], M, N, visited, cabbages)

    print(ans)
