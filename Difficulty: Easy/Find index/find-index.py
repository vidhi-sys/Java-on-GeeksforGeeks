# User function Template for python3

arr = tuple(map(int, input().split()))
x = int(input())

########### Write your code below ###############
idx = -1
for i in range(len(arr)):
    if arr[i] == x:
        idx = i
        break

print(idx)

