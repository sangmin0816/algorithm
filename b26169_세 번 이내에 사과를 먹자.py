import sys
input = sys.stdin.readline

x = [1, -1, 0, 0]
y = [0, 0, 1, -1]
   
def dfs(sx, sy, move, arr, visited, apple):
   visited[sx][sy] = 1
   if arr[sx][sy] == 1:
      apple+=1
   if move>=3 and apple<2:
      return
   elif apple>=2:
      print(1)
      sys.exit(0)
   for i in range(4):
      ex = x[i]+sx
      ey = y[i]+sy
      if ex <5 and ey<5 and ex>=0 and ey>=0:
         if visited[ex][ey]==0 and arr[ex][ey]!=-1:
            dfs(ex, ey, move+1, arr, visited, apple)
            visited[ex][ey] = 0

arr = []
for i in range(5):
   arr.append(list(map(int, input().strip().split(' '))))

r, c = map(int, input().split(' '))
visited = [[0 for n in range(5)] for n in range(5)]
dfs(r, c, 0, arr, visited, 0)
print(0)