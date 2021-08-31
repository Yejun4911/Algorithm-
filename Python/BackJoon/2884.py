'''
2021-05-17

2884번 
'''

n = list(map(int,input().split()))
if n[0]==0:
    n[0]=24

hours=n[0]*3600
minit=n[1]*60
sum_=hours+minit-2700
print(int(sum_/3600), int((sum_%3600)/60))