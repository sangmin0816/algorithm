import sys
input = sys.stdin.readline

N, M = map(int, input().split(' '))
packages = list()
singles = list()

for m in range(M):
    package, single = map(int, input().split(' '))
    if package > single*6:
        packages.append(single*6)
    packages.append(package)
    singles.append(single)

packages.sort()
singles.sort()

ans = 0

if N>5:
    ans += N//6*min(packages)
    N %= 6

if min(packages)>N*min(singles):
    ans += N*min(singles)
else:
    ans += min(packages)

print(ans)