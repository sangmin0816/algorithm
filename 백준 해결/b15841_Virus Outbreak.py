cows = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]

while True:
   X = int(input())
   if X==-1:
      break
   if len(cows) <= X+1:
      for i in range(len(cows), X+1):
         cows.append(cows[i-1]+cows[i-2])
   print(f"Hour {X}: {cows[X]} cow(s) affected")
      
   