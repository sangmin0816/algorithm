import sys
input = sys.stdin.readline

dwarfs = list()
for i in range(9):
    dwarfs.append(int(input()))

ans = sum(dwarfs)-100
fake = list()
flag = False

dwarfs.sort()

for i in range(8):
    if flag:
         break
    for j in range(i, 9):
        if dwarfs[i]+dwarfs[j]==ans:
            fake.append(dwarfs[i])
            fake.append(dwarfs[j])
            flag = True
            break

for d in dwarfs:
    if d not in fake:
        print(d)