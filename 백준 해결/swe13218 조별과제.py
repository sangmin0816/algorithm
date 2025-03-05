T = int(input())

for t in range(1, T+1):
    N = int(input())
    if N<3:
        ans = 0
    else:
        ans = N//3
    print("#%d"%(t), ans)