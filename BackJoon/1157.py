'''
20201-05-10
1157 단어 공부
'''

a=input()

hash_a={}
answer=[]
for j in a:
    j=j.upper()
    if j in hash_a:
        hash_a[j]+=1
    else:
        hash_a[j]=1

vList=max(hash_a.values())

for key ,value in hash_a.items():
    if value==vList:
        answer.append(key)

if len(answer)>1:
    print("?")
else:
    print(answer[0])
