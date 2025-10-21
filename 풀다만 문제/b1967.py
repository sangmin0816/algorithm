#https://www.acmicpc.net/problem/1967
#시간 초과
import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

N = int(input())
edges = [[] for n in range(N+1)]

for i in range(N-1):
    p, c, v = map(int, input().split(' '))
    edges[p].append([c, v])
    edges[c].append([p, v])

leaf = list()
max_l = 0
max_li = 0

for i, e in enumerate(edges):
    if len(e)==1:
        leaf.append(i)
        if e[0][1] > max_l:
            max_l = e[0][1]
            max_li = i
        

def dfs(now, leaf, edges, cnt, visited, ans):
    if not visited[now]:
        visited[now] = True
        if now in leaf:
            ans.append(cnt)
            return
        else:
            for c, v in edges[now]:
                dfs(c, leaf, edges, cnt+v, visited, ans)

ans = []
visited = [False for n in range(N+1)]
dfs(max_li, leaf, edges, 0, visited, ans)
    
print(max(ans))