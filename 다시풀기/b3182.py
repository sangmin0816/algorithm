import sys
input = sys.stdin.readline

N = int(input())
arr =[[] for n in range(N+1)]
for n in range(1, N+1):
   m = int(input())
   arr[n].append(m)
   arr[m].append(n)

ans = []
for n in range(1, N+1):
   ans.append(len(arr[n]))

print(ans)
print(ans.index(max(ans))+1)