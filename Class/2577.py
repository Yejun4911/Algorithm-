'''
2021-05-17

2577번 
'''
mul=1
result=[]
for i in range(3):
    A=int(input())
    mul*=A
mul=str(mul)

for j in range(0,10):
    result.append(mul.count(str(j)))
for k in result:
    print(k)
