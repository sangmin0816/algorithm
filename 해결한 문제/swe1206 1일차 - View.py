import sys
input = sys.stdin.readline

for t in range(10):
    N = int(input())
    buildings = list(map(int, input().rstrip().split(' ')))
    ans = 0

    for i in range(2, N-2):
        view = buildings[i] - max(buildings[i-1], buildings[i-2], buildings[i+1], buildings[i+2])
        if view>0:
            ans+=view

    print("#%d"%(t+1), ans)