'''
2021-05-21
소수만들기
'''



import itertools

def solution(nums):
    result2=[]
    answer = 0
    result = list(map(sum,itertools.combinations(nums,3)))
    
    for j in result:
        flag=True
        if j!=1:
            for f in range(2,j):
                if j%f==0:
                    flag=False            
            if flag==True:
                answer+=1        
                
    return answer