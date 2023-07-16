import sys
input = sys.stdin.readline

N, M, K = map(int, input().split(' '))
arr = [[False for m in range(M)]for n in range(N)]
mx = [0, 0, 1, -1]
my = [1, -1, 0, 0]

for k in range(K):
    ly, lx, ry, rx = map(int, input().split(' '))
    for i in range(lx, rx):
        for j in range(ly, ry):
            arr[i][j] = True

def dfs(start, N, M, arr, visited):
    stack = [start]
    cnt = 0

    while stack:
        nx, ny = stack.pop()
        if 0<=nx<N and 0<=ny<M:
            if not visited[nx][ny]:
                visited[nx][ny] = True
                if not arr[nx][ny]:
                    cnt+=1
                    for i in range(4):
                        stack.append([nx+mx[i], ny+my[i]])

    return cnt

ans1 = 0
ans2 = []
visited = [[False for m in range(M)]for n in range(N)]
for i in range(N):
    for j in range(M):
        if not visited[i][j] and not arr[i][j]:
            ans2.append(dfs([i, j], N, M, arr, visited))
            ans1 += 1

print(ans1)
if ans1:
    for a in sorted(ans2):
        print(a, end=' ')