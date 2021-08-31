'''
2021-05-17

2439번 
'''

n = int(input())

for i in range(1,n+1):
    str1=" "*(n-i)
    str2="*"*i

    print(str1+str2)
