import sys
input = sys.stdin.readline

C = int(input())
for c in range(C):
   world_cup = dict()
   for i in range(16):
      t1, t2, g1, g2 = input().split(' ')
      if t1 not in world_cup:
         world_cup[t1] = 0
      if t2 not in world_cup:
         world_cup[t2] = 0
      g1 = int(g1)
      g2 = int(g2)
   
      if(g1>g2):
         world_cup[t1] += 1
      else:
         world_cup[t2] += 1
   
   winner = max(world_cup, key = world_cup.get)
   print(winner)