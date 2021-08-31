'''
2021-05-17

2675번 
'''
n = int(input())
end=[]
for i in range(n):
    answer=[]
    result=input().split()
    for j in result[1]:
        answer.append(j*int(result[0]))
    end.append("".join(answer))
for k in end:
    print(k)