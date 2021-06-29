'''
2021-05-23
14562번
'''
ST=[]
answer=[]
size = int(input())
cnt = 0

def taekwon(S,T):
    global cnt
    if S*2>T and cnt==0:
        return S-T
    elif S*2==T:
        S+1
        cnt+=1
        taekwon(S,T)
    elif S*3<T:
        while True:
            S=S*S
            T=T+3
            if S==T:
                break
    elif S-1==T:
        cnt+=1

    return cnt
for i in range(size):
    ST.append(list(map(int,input().split())))

for j in ST:
    cnt=0
    answer.append(taekwon(j[0],j[1]))


