import sys
input = sys.stdin.readline

T = int(input())
for t in range(T):
   N = int(input())
   arr = list(map(int, input().split(' ')))
   ans = [0 for n in range(N)]
   ans[0] = 1
   for i in range(1, N):
      if arr[i] > arr[i-1]:
         ans[i] = ans[i-1]+1
      else:
         for j in range(i):
            ans[i] = max(ans[i], ans[j])
      
   print(f"Case #{t+1}: {N-max(ans)}")