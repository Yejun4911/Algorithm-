N = int(input())
N_list = list(map(int,input().split()))
M = int(input())
M_list = list(map(int,input().split()))

dic={}
N_list.sort()


start,end=0,max(N_list)

while start<=end:
    i=0
    M_list[i]
    mid = start+end // 2

    if N_list[mid]<M_list[i]:
        mid+=1
    elif N_list[mid]==M_list[i]:
        dic[M_list[i]]+=1
        mid+=1
    else:
        







