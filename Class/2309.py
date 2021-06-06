'''
2021-05-17

2309번 
'''
nlist=[]

for i in range(9):
    nlist.append(int(input()))
nlist_sum=sum(nlist)

flag=True

for i in nlist:
    if flag==False:
        break
    temp=nlist_sum-i
    for j in nlist:
        if j==i:
            continue
        if temp-j == 100:
            nlist.remove(i)
            nlist.remove(j)
            flag=False
            break

nlist.sort()
for i in range(len(nlist)):
    print(nlist[i])
