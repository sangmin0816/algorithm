from collections import deque
import sys
input = sys.stdin.readline

sudoku = list()
for i in range(9):
    sudoku.append(list(map(int, input().split(' '))))

zeros = deque()
for i in range(9):
    for j in range(9):
        if sudoku[i][j]==0:
            zeros.append([i, j])

while zeros:
    x, y = map(int, zeros.pop())
    ans = [True for i in range(10)]
    
    for i in range(9):
        ans[sudoku[i][y]] = False
    
    if ans.count(True)==1:
        for i, b in enumerate(ans):
            if b:
                sudoku[x][y] = i
    else:
        for j in range(9):
            ans[sudoku[x][j]] = False
        if ans.count(True)==1:
            for i, b in enumerate(ans):
                if b:
                    sudoku[x][y] = i
        else:
            for i in range(x//3*3, (x//3)*3+3):
                for j in range(y//3*3, (y//3)*3+3):
                    ans[sudoku[i][j]] = False
            
            if ans.count(True)!=1:
                zeros.appendleft([x, y])
            else:
                for i, b in enumerate(ans):
                    if b:
                        sudoku[x][y] = i

for i in range(9):
    for j in range(9):
        print(sudoku[i][j], end=' ')
    print()