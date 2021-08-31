'''
2021-05-23
15650번
'''
import itertools
n = list(map(int,input().split()))
list_=[]
for i in range(1,n[0]+1):
    list_.append(i)

answer=itertools.combinations(list_,n[1]) #결과가 object type 반환 필요~_~


for i in answer:
    print(" ".join(map(str,i)))