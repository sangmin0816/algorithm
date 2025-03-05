# 틀림
# 인생을 너무 쉽게 살려고 했나
import sys
input = sys.stdin.readline

K = int(input())
order = [0]
order.extend(list(map(int, input().split(' '))))
tree = [[] for k in range(K)]

level = K-1
i = 1
k = 2

while k <= K**2:
    for o in range(i, len(order), k):
        tree[level].append(order[o])
    level -= 1
    k = k*2
    i = i*2

for t in tree:
    for n in t:
        print(n, end=' ')
    print()