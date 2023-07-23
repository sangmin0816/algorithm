from queue import PriorityQueue
import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))
arr = list(map(int, input().split(' ')))
pq = PriorityQueue()
for a in arr:
    pq.put(a)

for m in range(M):
    op1 = pq.get()
    op2 = pq.get()
    pq.put(op1+op2)
    pq.put(op1+op2)

total = 0
for n in range(N):
    total+=pq.get()

print(total)