'''
2021-05-23

2231번 
'''

n=int(input())
result=[]

for i in range(1,n+1):
    sum_ = 0
    i=str(i)
    for j in i:
        sum_+=int(j)
    else:
        if sum_+int(i)==n:
            result.append(i)

if len(result)==0:
    print(0)
else:
    print(min(result))

