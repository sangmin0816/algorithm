import sys
input = sys.stdin.readline

N = int(input())
arr = [int(input()) for n in range(N)]

plus = []
minus = []

ans = 0

for a in arr:
    if a>1:
        plus.append(a)
    elif a==1:
         ans+=a
    else:
        minus.append(a)

plus.sort(reverse=True)
for i in range(len(plus)//2):
        ans+=plus[i*2]*plus[i*2+1]
if len(plus)%2!=0:
    ans+=plus[-1]

minus.sort()
for i in range(len(minus)//2):
        ans+=minus[i*2]*minus[i*2+1]
if len(minus)%2!=0:
    ans+=minus[-1]

print(ans)