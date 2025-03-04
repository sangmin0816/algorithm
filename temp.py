from itertools import combinations
import sys
input = sys.stdin.readline

R, B = map(int, input().split(' '))
size = R+B

num = list(i for i in range(1, size+1))*2

for i, j in combinations(num, 2):
    if i*j==size and ((i+j)*2-4)==R:
        print(j, i)
        sys.exit(0)