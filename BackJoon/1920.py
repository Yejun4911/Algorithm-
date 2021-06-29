N = int(input())
A_list= input().split(" ")
M = int(input())
M_list= input().split(" ")
result=[]
for i in range(len(M_list)):
    if M_list[i] in A_list:
        result.append(1)
    else:
        result.append(0)

for j in result:
    print(j)