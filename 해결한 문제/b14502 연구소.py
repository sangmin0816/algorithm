from collections import deque
from itertools import combinations
import sys
input = sys.stdin.readline
mx = [1, -1, 0, 0]
my = [0, 0, 1, -1]
N, M = map(int, input().split(' '))
lab = list()

for n in range(N):
    lab.append(list(map(int, input().split(' '))))

virus = list()
zeros = list()
for n in range(N):
    for m in range(M):
        if lab[n][m]==2:
            virus.append([n, m])
        elif lab[n][m] == 0:
            zeros.append([n, m])

def bfs(start, N, M, lab_temp):
    que = deque(start)
    visited = [[False for m in range(M)] for n in range(N)]

    while que:
        nx, ny = que.popleft()
        if 0<=nx<N and 0<=ny<M:
            if not visited[nx][ny] and lab_temp[nx][ny]!=1:
                visited[nx][ny] = True
                lab_temp[nx][ny] = 2
                for i in range(4):
                    que.append([nx+mx[i], ny+my[i]])

ans = list()
for c in combinations(zeros, 3):
    lab_temp = [l.copy() for l in lab]
    for cx, cy in c:
        lab_temp[cx][cy] = 1

    bfs(virus, N, M, lab_temp)

    cnt = 0
    for l in lab_temp:
        cnt += l.count(0)
    ans.append(cnt)

print(max(ans))