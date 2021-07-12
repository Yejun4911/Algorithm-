K = list(map(int,input().split()))
K_list=[]

for i in range(K[0]):
    K_list.append(int(input()))
K_sum=sum(K_list)


while True:
    answer=[]
    for i in K_list:
        answer.append(int(i/K_sum))
        
    if sum(answer)==K[1]:
        print(K_sum)
        break
    else:
        K_sum-=1
