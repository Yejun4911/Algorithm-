'''
백준
단어정렬
1181

2021.07.01
'''


N=int(input())

N_list={}
for i in range(N):
    temp=input()
    N_list[temp]=len(temp)

s=sorted(N_list.items(),key=lambda item:(item[1],item[0]))

for x in s:
    print(x[0])