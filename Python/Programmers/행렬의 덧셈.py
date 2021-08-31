def solution(arr1, arr2):
    
    arr3=[]
    
    for i in range(len(arr1)):
        answer=[]
        for j in range(len(arr1[i])):
            answer.append(arr1[i][j]+arr2[i][j])
        arr3.append(answer)   
    
    
    return arr3