numbers = list("4177252841")
remains = sorted(numbers, reverse=True)
remains = remains[:4]
for i in numbers:
    if i not in remains:
        numbers.remove(i)
    else:
        remains.remove(i)
        
answer = ''.join(numbers)
print(answer)