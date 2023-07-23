from collections import deque
import sys
input = sys.stdin.readline

T = int(input())
for t in range(T):
    func = list(input().strip())
    N = int(input())
    arr = input().strip()[1:-1]
    if arr:
        arr = deque(list(map(int, arr.split(','))))
    else:
        arr = deque()
    flag = False
    isReverse = False
    for f in func:
        if f=='R':
            isReverse = not isReverse
        elif arr:
            if isReverse:
                arr.pop()
            else:
                arr.popleft()
        else:
            print("error")
            flag = True
            break
    if not flag:
        if isReverse:
            arr.reverse()
        print("[", end="")
        for i in range(len(arr)-1):
            print(arr[i], end=',')
        if arr:
            print(arr[-1], end="")
        print("]")