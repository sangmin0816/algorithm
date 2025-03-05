# 코드는 쬐금 더럽지만 맞았따!

import sys
input = sys.stdin.readline

before = list(input().rstrip())
explosion = list(input().rstrip())
stack = list()

for b in before:
    stack.append(b)
    if b==explosion[-1]:
        bomb = explosion.copy()
        temp = list()
        while stack and bomb:
            if stack[-1]==bomb.pop():
                temp.append(stack.pop())
            else:
                break
        if len(temp)!=len(explosion):
            while temp:
                stack.append(temp.pop())
    

if stack:
    print(''.join(stack))
else:
    print("FRULA")