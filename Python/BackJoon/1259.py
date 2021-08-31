'''
팰린드롬수
1259번
2021-07-01
'''
answer=[]
num_list=[]
while True:
    temp=input()
    if temp=='0':
        break
    else:
        num_list.append(temp)
    
for i in num_list:
    temp_res=i[::-1]
    if i==temp_res:
        answer.append("yes")
    else:
        answer.append("no")
    
for i in answer:
    print(i)
