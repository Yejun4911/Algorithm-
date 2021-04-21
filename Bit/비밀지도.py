def solution(n, arr1, arr2):
    temp = []
    arr=arr1+arr2
    array = [[" "]*n for i in range(n)]
    answer=[]
    cnt=0
    
    for i in arr:
        i=bin(i)[2:]
        if len(i)< len(bin(max(arr))[2:]):
            tmp=len(bin(max(arr))[2:])-len(i)
            i="0"*tmp+i
        for j in range(len(i)):
            if i[j]=="1":
                i[j]="#"
            else:
                i[j]=" "
        cnt+=1
    
    print(arr)
    
#     for i in array:
#         answer.append("".join(i))
    return answer


print(solution(5,[9, 20, 28, 18, 11],[30, 1, 21, 17, 28]))