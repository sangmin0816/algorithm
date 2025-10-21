import sys
input = sys.stdin.readline

N = int(input())

haligali = dict()
for n in range(N):
   fruit, x = input().split(' ')
   if fruit not in haligali:
      haligali[fruit] = 0
   haligali[fruit] += int(x)

for f, x in haligali.items():
   if x == 5:
      print("YES")
      sys.exit(0)
   
print("NO")