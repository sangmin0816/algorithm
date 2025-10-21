import sys
input = sys.stdin.readline

N = int(input())
towers = list(map(int, input().split(' ')))

ans = 1
before = 0

for i in range(1, N):
   if towers[i-1] > towers[i]:
      continue
   ans += 1

print(ans)

# 문제가 너무 엉성하다.
# 아니 더 큰게 무너져서 뒤에 것도 무너질거면 다같이 무너져야지 왜 바로 앞에것만 영향을 받는담... 