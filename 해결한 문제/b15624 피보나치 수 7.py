# 옛날엔 이런 문제를 틀렸었다.
import sys
input = sys.stdin.readline

fibonacci = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597]

N = int(input())

if N>17:
    for n in range(17, N):
        fibonacci.append((fibonacci[n]+fibonacci[n-1])%1000000007)

print(fibonacci[N])