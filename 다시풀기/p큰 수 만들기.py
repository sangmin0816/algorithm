numbers = list("1924")
k = 2
stack = []
for i in numbers:
   while stack and stack[-1] < i and k>0:
      stack.pop()
      k -= 1
   stack.append(i)

print(''.join(stack))