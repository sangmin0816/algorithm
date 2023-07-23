import sys
input = sys.stdin.readline

N, M, B = map(int, input().split(' '))
arr = [list(map(int, input().split(' '))) for n in range(N)]
total = 0
for n in range(N):
    total+=sum(arr[n])
average = int(total/(N*M))

if average>256:
    average = 256

second1 = 0 #average
for n in range(N):
    for m in range(M):
        temp = arr[n][m]-average
        if temp>=0:
            second1+=2*temp
        else:
            second1+=(-temp)

if total+B>=average*N*M and average<256:
    second2 = 0
    for n in range(N):
        for m in range(M):
            temp = arr[n][m]-(average+1)
            if temp>=0:
                second2+=2*temp
            else:
                second2+=(-temp)
    if second1>=second2:
        print(second2, average+1)
    else:
        print(second1, average)
else:
    print(second1, average)