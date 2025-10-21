import sys
input = sys.stdin.readline

N = int(input())
F = int(input())
N_new = N//100*100

for i in range(100):
    if N_new%F == 0:
        break
    N_new += 1

ans = N_new%100
print("%.2d"%(ans))