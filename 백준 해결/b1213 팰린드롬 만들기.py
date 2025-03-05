from collections import deque
import sys
input = sys.stdin.readline

name = list(input().rstrip())
length = len(name)

middle = ''
half = ''
half2 = deque()

name.sort()

for n in sorted(set(name)):
    n_len = name.count(n)
    for i in range(n_len//2):
            half += n
            half2.appendleft(n)
    if n_len%2!=0:
        if middle=='':
            middle = n
        else:
            print("I'm Sorry Hansoo")
            sys.exit(0)

print(half+middle+''.join(half2))