import sys
input = sys.stdin.readline

R, C = map(int, input().split(' '))
board = [list(input().rstrip()) for r in range(R)]

mx = [1, -1, 0, 0]
my = [0, 0, 1, -1]

global ans
ans = 0

def dfs(x, y, R, C, board, arr):
    global ans
    ans = max(ans, len(arr))
    if 0<=x<R and 0<=y<C:
        if board[x][y] not in arr:
            arr.append(board[x][y])
            for i in range(4):
                dfs(x+mx[i], y+my[i], R, C, board, arr)
            arr.pop()

dfs(0, 0, R, C, board, [])