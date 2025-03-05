from collections import deque
import sys
input = sys.stdin.readline

msg = input().rstrip()
N = int(input())
ans = 0

for n in range(N):
    ring = deque(input().rstrip())
    for i in range(10):
        now = ''.join(list(ring)).count(msg)
        if now>0:
            ans+=1
            break
        ring.append(ring.popleft())

print(ans)