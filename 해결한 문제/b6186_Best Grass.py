import sys
input = sys.stdin.readline

R, C = map(int, input().split(' '))
pasture = []
for r in range(R):
   pasture.append(list(input().strip()))

visited = [[0 for c in range(C)] for r in range(R)]
grass_clumps = 0

x = [1, -1, 0, 0]
y = [0, 0, 1, -1]

def dfs(arr, visited, i, j):
   if visited[i][j]:
      return
   
   visited[i][j] = 1
   if arr[i][j] == '#':
      for f in range(4):
         new_x = x[f]+i
         new_y = y[f]+j
         if 0<=new_x<R and 0<=new_y<C:
            dfs(arr, visited, new_x, new_y)

for i in range(R):
   for j in range(C):
      if visited[i][j] or pasture[i][j] == '.':
         continue
      else:
         dfs(pasture, visited, i, j)
         grass_clumps += 1

print(grass_clumps)