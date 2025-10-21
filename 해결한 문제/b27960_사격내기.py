import sys
input = sys.stdin.readline

S_A, S_B = map(int, input().split(' '))

print(S_A^S_B)