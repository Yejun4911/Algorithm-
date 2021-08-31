N_list=list(map(int,input().split()))

chess=[1,1,2,2,2,8]

for i in range(len(N_list)):
    if N_list[i]==chess[i]:
        N_list[i]=0
    else:
        N_list[i]=chess[i]-N_list[i]

print(' '.join(map(str,N_list)))