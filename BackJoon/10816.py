from sys import stdin
from collections import Counter # Counter 이용

N = int(input())
arr_n = list(map(int,stdin.readline().split()))
M = int(input())
arr_m = list(map(int,stdin.readline().split()))

a=Counter(arr_n) # list 안에 카운트를 미리 구한다.
str2=""
for i in arr_m: # 찾고자 하는 정수의 개수를 카운터를 이용해 미리 구해놓은 리스트를 안에서 해당 정수의 카운트를 찾아 append
    if i in a:
        str2+=str(a[i])+" "
    else:
        str2+=str(0)+" "
        
print(str2)