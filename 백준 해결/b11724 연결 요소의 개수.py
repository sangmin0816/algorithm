from collections import deque
import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))
edges = [[] for n in range(N+1)]

for m in range(M):
    s, e = map(int, input().split(' '))
    edges[s].append(e)
    edges[e].append(s)

visited = [False for n in range(N+1)]

def bfs(start, visited, edges):
    que = deque([start])

    while que:
        now = que.popleft()
        if not visited[now]:
            visited[now] = True
            for e in edges[now]:
                que.append(e)

ans = 0
for n in range(1, N+1):
    if not visited[n]:
        ans+=1
        bfs(n, visited, edges)

print(ans)