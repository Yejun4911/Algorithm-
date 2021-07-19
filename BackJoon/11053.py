N =int(input())
A = list(map(int,input().split()))
temp=A[0]
cnt=0

for i in A:
    if temp<i:
        temp=i
        cnt+=1

print(cnt)