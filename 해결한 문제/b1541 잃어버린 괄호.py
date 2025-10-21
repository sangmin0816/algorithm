import sys
input = sys.stdin.readline

expression = list(input())
new_expression = list()
temp = list()

for e in expression:
    if '0' <= e <= '9':
        temp.append(e)
    else:
        new_expression.append(int(''.join(temp)))
        temp = list()
        if e=='-':
            new_expression.append(e)

ans = 0
flag = False
for n in new_expression:
    if n=='-':
        flag = True
    else:
        if flag:
            n = -n
        ans += n

print(ans)