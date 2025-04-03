import sys
input = sys.stdin.readline

N = int(input())

ans = 1
start = 1
end = 2
sum = start+end

while(end < (N//2+1)):
    if(sum<N):
        end += 1
        sum += end
    elif(sum>N):
        sum -= start
        start += 1
    elif(sum==N):
        ans += 1
        sum -= start
        start += 1
        

print(ans)