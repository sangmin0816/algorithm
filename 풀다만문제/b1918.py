import sys
input = sys.stdin.readline

expression = list(input().rstrip())
operator = ['+', '-', '*', '/', '(', ')']
stack = list()

for e in expression:
    if e not in operator:
        stack.append(e)
