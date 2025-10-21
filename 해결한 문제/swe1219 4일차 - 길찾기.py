from collections import deque

def bfs(start, end, edges):
    visited = [False for i in range(100)]
    que = deque([start])

    while que:
        now = que.popleft()
        if now==end:
            return 1
        if not visited[now]:
            visited[now] = True
            for e in edges[now]:
                que.append(e)
    
    return 0
        

for _ in range(1, 11):
    t, N = map(int, input().rstrip().split(' '))
    temp = list(map(int, input().rstrip().split(' ')))
    edges = [[] for i in range(100)]
    for n in range(N):
        edges[temp[2*n]].append(temp[2*n+1])

    ans = bfs(0, 99, edges)
    print("#%d"%(t), ans)