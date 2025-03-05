for t in range(1, 11):
    N = int(input())
    arr = [list(map(int, input().rstrip().split(' '))) for n in range(100)]
    ans = []

    dia1 = 0
    dia2 = 0
    for i in range(100):
        row = 0
        dia1+=arr[i][i]
        dia2+=arr[i][99-i]
        col = 0
        for j in range(100):
            col+=arr[j][i]
            row+=arr[i][j]
        ans.append(col)
        ans.append(row)
    
    ans.append(dia1)
    ans.append(dia2)
    
    print("#%d"%(t), max(ans))