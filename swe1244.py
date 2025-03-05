def swap(x, y):
    temp = x
    x = y
    y = temp
    return x, y

def combinations(arr, r):
    arr = sorted(arr)
    result = list()
    
    def generate(chosen):
        if len(chosen)==r:
            result.append(chosen.copy())
            return
        
        start = 0
        if chosen:
            start = arr.index(chosen[-1])+1
        for nxt in range(start, len(arr)):
            chosen.append(arr[nxt])
            generate(chosen)
            chosen.pop()
    
    generate([])
    return result

T = int(input())
for t in range(1, T+1):
    num, exchange = map(int, input().split(' '))
    num = list(map(str, str(num)))
    candidates = list()
    for comb in combinations(combinations(range(len(num)), 2), exchange):
        temp = num.copy()
        for x, y in comb:
            temp[x], temp[y] = swap(temp[x], temp[y])
            candidates.append(temp)
            
    ans = ''.join(max(candidates))

    print("#%d"%(t), ans)

