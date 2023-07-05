import sys
input = sys.stdin.readline

fibo = [1, 2]

while fibo[-1]<10**100:
    fibo.append(fibo[-1]+fibo[-2])

while True:
    a, b = map(int, input().split(' '))
    if a==b and a==0:
        sys.exit(0)

    i=0
    while fibo[i]<a:
        i+=1
    j=i
    while fibo[j]<=b:
        j+=1
    print(j-i)
    