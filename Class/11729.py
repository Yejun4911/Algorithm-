n = int(input())

arr1=[]
arr2=[]
arr3=[]
i=1
for i in range(1,n+1):
    arr1.append(i)

while len(arr1)!=0:
    arr1.remove(i)
    
    
    i+=1
arr1.remove(1)
print(arr1)