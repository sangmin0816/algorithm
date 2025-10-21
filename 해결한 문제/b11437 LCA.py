# pypy로 간신히 맞았지만 찝찝하다 뭐가 잘못된 것 같아

import sys
input = sys.stdin.readline

N = int(input())
edges = [[] for n in range(N+1)]
parents = [-1 for n in range(N+1)]
depth = [0 for n in range(N+1)]
parents[1] = 1

for n in range(N-1):
    p, c = map(int, input().split(' '))
    edges[p].append(c)
    edges[c].append(p)

visited = []
deq = [[1]]
i=0

while deq: 
    que = deq.pop()
    temp = list()
    while que:
        now = que.pop()
        visited.append(now)
        depth[now] = i
        for e in edges[now]:
            if e not in visited:
                parents[e] = now
                temp.append(e)
    if temp:
        deq.append(temp)
    i+=1

def isParent(one, two):
    cha = depth[one]-depth[two]
    if cha>0:
        while cha!=0:
            cha-=1
            one = parents[one]
    elif cha<0:
        while cha<0:
            cha+=1
            two = parents[two]
    
    while one!=two:
        one = parents[one]
        two = parents[two]
    
    return one
    
M = int(input())        
for m in range(M):
    one, two = map(int, input().split(' '))
    print(isParent(one, two))
