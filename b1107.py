from itertools import combinations
import sys
input = sys.stdin.readline

N = input().rstrip()
M = int(input())
error = list(map(str, input().rstrip().split(' ')))

N_i = int(N)
flag = False

for i in range(0, N_i+1):
    h_plus = 100+i
    h_minus = 100-i
    plus = N_i+i
    minus = N_i-i
    if not set(list(str(plus))).intersection(error):
        flag = True
    if not set(list(str(minus))).intersection(error):
        flag = True
    if h_plus == N or h_minus==N:
        flag = True
    if flag:
        print(i)
        break
