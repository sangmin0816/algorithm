import sys
input = sys.stdin.readline

N = int(input())

num = list(map(int, input().split(' ')))
plus, minus, multiply, divisor = map(int, input().split(' '))

ans = list()

def expression(i, total, num, plus, minus, multiply, divisor):
    if i==len(num):
        ans.append(total)
        return
    
    if plus>0:
        expression(i+1, total+num[i], num, plus-1, minus, multiply, divisor)
    if minus>0:
        expression(i+1, total-num[i], num, plus, minus-1, multiply, divisor)
    if multiply>0:
        expression(i+1, total*num[i], num, plus, minus, multiply-1, divisor)
    if divisor>0:
        expression(i+1, int(total/num[i]), num, plus, minus, multiply, divisor-1)

expression(1, num[0], num, plus, minus, multiply, divisor)

print(max(ans))
print(min(ans))