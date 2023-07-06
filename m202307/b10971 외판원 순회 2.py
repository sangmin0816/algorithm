import sys
input = sys.stdin.readline

N = int(input())
arr = [list(map(int, input().split(' '))) for n in range(N)]
ans = []

def recur(start, N, arr, visited, cnt):
    if arr[start][0]>0 and not visited.count(False):
        ans.append(cnt+arr[start][0])
        return
    for i in range(N):
        if arr[start][i]>0 and not visited[i]:
            visited[i] = True
            recur(i, N, arr, visited, cnt+arr[start][i])
            visited[i] = False


visited = [False for n in range(N)]
visited[0] = True
recur(0, N, arr, visited, 0)

# 외판원 순회는 어디에서 시작하든 동일하므로 시작점을 하나로 고정해도 된다.
# 하지만 도시끼리 이어지지 않는 경우가 있으므로 마지막에 시작점으로 돌아올 수 있는지 체크해야 한다.

print(min(ans))