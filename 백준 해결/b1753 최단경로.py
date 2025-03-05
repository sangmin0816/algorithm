from queue import PriorityQueue
import sys
input = sys.stdin.readline
INF = float('inf')

V, E = map(int, input().split(' '))
K = int(input())

edges = [[] for v in range(V+1)]
for e in range(E):
    u, v, w = map(int, input().split(' '))
    edges[u].append([w, v])

def dijkstra(start, V, edges):
    distances = [INF for v in range(V+1)]
    visited = [False for v in range(V+1)]
    
    pq = PriorityQueue()
    pq.put([0, start])
    distances[start] = 0

    while not pq.empty():
        nw, nv = pq.get()
        if not visited[nv]:
            visited[nv] = True
            for w, v in sorted(edges[nv]):
                distances[v] = min(distances[v], distances[nv]+w)
                pq.put([distances[v], v])
        
    return distances
    
ans = dijkstra(K, V, edges)

for v in range(V):
    print(str(ans[v+1]).upper())