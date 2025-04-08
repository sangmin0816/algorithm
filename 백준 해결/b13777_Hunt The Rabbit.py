import sys
input = sys.stdin.readline

def bin_search(start, mid, end, key):
   print(mid, end=" ")
   if(mid==key):
      return True
   elif(mid>key):
      mid -= 1
      new_mid = (start+mid)//2
      bin_search(start, new_mid, mid, key)
   elif(mid<key):
      mid += 1
      new_mid = (end+mid)//2
      bin_search(mid, new_mid, end, key)

while True:
   N = int(input())
   if N==0:
      sys.exit(0)
   bin_search(1, 25, 50, N)
   print()