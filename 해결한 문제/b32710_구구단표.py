import sys
input = sys.stdin.readline

# 1일 때를 고려하지 못해서 한 번 틀림
# 조건을 잘 확인하자
N = int(input())

arr = set()
arr.add(1)
for i in range(2, 10):
   for j in range(1, 10):
      arr.add(i*j)

if N in arr:
   print(1)
else:
   print(0)