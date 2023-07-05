import sys
input = sys.stdin.readline

N = int(input())
arr = [int(input()) for n in range(N)]
dp = [0 for n in range(N+1)]
