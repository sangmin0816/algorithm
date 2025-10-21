import sys
input = sys.stdin.readline

mx = [1, -1, 0, 0, 1, -1, 1, -1]
my = [0, 0, 1, -1, 1, -1, -1, 1]

def dfs(start, W, H, visited, mapping):
    stack = [start]

    while stack:
        nx, ny = stack.pop()
        if 0<=nx<H and 0<=ny<W:
            if not visited[nx][ny] and mapping[nx][ny]==1:
                visited[nx][ny] = True
                for i in range(8):
                    stack.append([nx+mx[i], ny+my[i]])

while True:
    W, H = map(int, input().split(' '))
    if W==0 and H==0:
        break
    mapping = [list(map(int, input().split(' '))) for h in range(H)]
    ans = 0
    visited = [[False for w in range(W)] for h in range(H)]
    
    for h in range(H):
        for w in range(W):
            if mapping[h][w] and not visited[h][w]:
                dfs([h, w], W, H, visited, mapping)
                ans+=1
    
    print(ans)