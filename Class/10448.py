import itertools 
n = int(input())
num_list=[]
answer_list=[]
s_list=[]

for i in range(n):
    num_list.append(int(input()))


for i in range(1,max(num_list)):
    T=int(i*(i+1)/2)
    
    if T>max(num_list):
        break
    else:
        s_list.append(T)

sum_ = set(list(map(sum,itertools.product(s_list,repeat=3))))

for i in num_list:
    if i in sum_:
        answer_list.append(1)
    else:
        answer_list.append(0)


for j in answer_list:
    print(j)