import sys
input = sys.stdin.readline

N = int(input())
ingredients = list(map(str, input().strip().split(' ')))
arr = list(map(str, input().strip().split(' ')))

for i in ingredients:
   if i not in arr:
      print(i)
      break
