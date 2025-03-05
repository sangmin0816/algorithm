for t in range(1, 11):
    dump = int(input())
    boxes = list(map(int, input().rstrip().split(' ')))
    
    for d in range(dump):
        boxes.sort()
        boxes[0] += 1
        boxes[-1] -= 1
    
    ans = max(boxes)-min(boxes)
    print("#%d"%(t), ans)