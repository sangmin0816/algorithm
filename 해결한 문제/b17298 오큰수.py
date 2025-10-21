import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))
stack = list()
ans = list()

while arr:
    now = arr.pop()
    while stack:
        if stack[-1]>now:
            ans.append(stack[-1])
            break
        stack.pop()
    if not len(stack):
        ans.append(-1)
    stack.append(now)

while ans:
    print(ans.pop(), end=' ')