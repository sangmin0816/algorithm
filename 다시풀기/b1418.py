import sys
input = sys.stdin.readline

N = int(input())
K = int(input())

# 1은 소수가 아님
primeNumber = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71]
ans = set()
for p in primeNumber:
   if p>K:
      break
   for k in range(2, N+1):
      if(k%p==0 and k//p<=p ):
         ans.add(k)

for n in range(2, N+1):
   for p in primeNumber:
      if(k%p==0 )

print(ans)
print(len(ans))