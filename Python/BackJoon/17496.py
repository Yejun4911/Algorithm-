N,T,C,P = map(int,input().split())
cnt=0
day_cnt=1
while N>day_cnt:
    cnt+=C
    day_cnt+=T
    if day_cnt+T>N:
        break

print(cnt*P)