from itertools import combinations
import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))
cities = [list(map(int, input().split(' '))) for n in range(N)]

chicken = list()
house = list()
for i in range(N):
    for j in range(N):
        if cities[i][j] == 1:
            house.append([i, j])
        elif cities[i][j] == 2:
            chicken.append([i, j])

ans = list()

for chick in combinations(chicken, M):
    total = list()
    for i, j in house:
        distance = list()
        for x, y in chick:
            distance.append(abs(x-i)+abs(y-j))
        total.append(min(distance))
    ans.append(sum(total))

print(min(ans))