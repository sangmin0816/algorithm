T = int(input())

for t in range(1, T+1):
    L, U, X = map(int, input().split(' '))
    if L<=X<=U:
        ans = 0
    elif X<L:
        ans = L-X
    else:
        ans = -1
    print("#%d"%(t), ans)