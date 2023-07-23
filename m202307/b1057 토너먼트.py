import sys
input = sys.stdin.readline

N, K, I = map(int, input().split(' '))
ans = 1

while True:
    I = (I+1)//2
    K = (K+1)//2
    if I==K:
        break
    ans+=1

print(ans)