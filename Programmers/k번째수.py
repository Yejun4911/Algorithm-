'''
K번째수
https://programmers.co.kr/learn/courses/30/lessons/42748

'''

def solution(array, commands):
    answer = []
    
    for a in commands:
        i=a[0]-1
        j=a[1]
        z=a[2]-1
        
        k=array[i:j]
        
        k.sort()
        
        answer.append(k[z])
        
    return answer