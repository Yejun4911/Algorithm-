cnt,P = map(int,input().split())
cnt_list = list(map(int,input().split()))

temp=cnt*P
answer=[]

for i in cnt_list:
    if i ==temp:
        answer.append(0)
    else:
        answer.append(i-temp)

print(' '.join(map(str,answer)))