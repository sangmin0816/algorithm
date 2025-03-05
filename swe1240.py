T = int(input())
for t in range(1, T+1):
    N, M = map(int, input().split(' '))
    codes = [int(input(), 2) for n in range(N)]
    flag = False
    ans = 0
    for c in codes:
        print(c)
        if c>0:
            num = str(c)
            odd = 0
            even = 0
            for i in range(4):
                odd+=int(num[i*2])
                even+=int(num[i*2+1])
            ans += odd+even
            if (odd*3+even%10)!=0:
                flag = True
                break
    
    if flag:
        ans = 0

    print("#%d"%(t), ans)