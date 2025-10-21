import sys
input = sys.stdin.readline

word = input().rstrip()
length = len(word)

ans = list()

for i in range(1, length-2):
    for j in range(i+1, length):
        first = list(word[:i])
        second = list(word[i:j])
        third = list(word[j:])

        first.reverse()
        second.reverse()
        third.reverse()

        temp = ''.join(first)+''.join(second)+''.join(third)
        ans.append(temp)

ans.sort()
print(ans[0])