import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))
stack = list()

for i, a in enumerate(arr):
    while stack:
        if stack[-1][0] > a:
            print(stack[-1][1], end=' ')
            break
        stack.pop()
    if not len(stack):
        print(0, end=' ')
    stack.append([a, i+1])