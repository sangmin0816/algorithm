# Pypy로 간신히 통과
import sys
input = sys.stdin.readline

N = int(input())
dp = (N-2)
if N<3:
    dp = 1

fibonacci = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597]

for n in range(17, 44):
    fibonacci.append(fibonacci[n]+fibonacci[n-1])

for n in range(45, N+1):
    nb = n%45
    fibonacci[n%45] = (fibonacci[nb-1]+fibonacci[nb-2])%1000000007

print(fibonacci[N%45], dp)