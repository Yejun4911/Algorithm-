def soultion(arr):
    answer=[]
    for i in range(0,len(arr)-2):
        if arr[i]<arr[i+1]:
            if arr[i+1]>arr[i+2]:
                answer.append(i)
    print(len(answer))


soultion([3,2,5,6,4,3,7])