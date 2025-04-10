import sys
input = sys.stdin.readline

N = int(input())
arr = list(map(int, input().split(' ')))

# 그리디와 DP의 혼합문제
# 브루트포스 방법 외에 시간을 줄일 수 있는 방법을 잘 생각해보기

minimum = arr[0]
ans = 0
for i in range(1, N):
   minimum = min(minimum, arr[i])
   ans = max(ans, arr[i]-minimum)

print(ans)