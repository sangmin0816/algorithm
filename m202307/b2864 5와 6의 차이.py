import sys
input = sys.stdin.readline

A, B = map(str, input().rstrip().split(' '))

print(int(A.replace('6', '5'))+int(B.replace('6', '5')), end=' ')
print(int(A.replace('5', '6'))+int(B.replace('5', '6')), end=' ')