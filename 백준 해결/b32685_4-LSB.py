import sys
input = sys.stdin.readline

a = int(input())
b = int(input())
c = int(input())

# format(변수, 'b') 접두사 b 없이 int형을 이진수로 변환
# zfill(n) n 자리만큼 이진수 앞자리를 0으로 채워줌
a_bin = str(format(a, 'b').zfill(4))[-4:]
b_bin = str(format(b, 'b').zfill(4))[-4:]
c_bin = str(format(c, 'b').zfill(4))[-4:]

ans = a_bin+b_bin+c_bin
# 변수.encode() 문자열을 이진수로 변환
ans = int(ans.encode(), 2)

# format(변수, '0n') n자리만큼 앞에 0을 채워줌
print(format(ans, '04'))