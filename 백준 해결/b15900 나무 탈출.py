import sys
input = sys.stdin.readline

N = int(input())
edges = [[] for n in range(N+1)]

for n in range(N-1):
    s, e = map(int, input().split(' '))
    edges[s].append(e)
    edges[e].append(s)

def dfs(start, N, edges):
    visited = [False for n in range(N+1)]
    cnt = [0 for n in range(N+1)]
    stack = [start]
    ans = 0

    while stack:
        now = stack.pop()
        visited[now] = True
        flag = True
        for e in edges[now]:
            if not visited[e]:
                cnt[e] += cnt[now]+1
                stack.append(e)
                flag = False
        if flag:
            ans += cnt[now]
    
    return ans


ans = dfs(1, N, edges)
if ans%2==0:
    print("No")
else:
    print("Yes")