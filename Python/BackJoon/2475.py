'''
2021-05-17

2475번 
'''

n = list(map(int,input().split()))
result=[]
for i in n:
    result.append(i ** 2)

print(sum(result)%10)