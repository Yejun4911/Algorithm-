def solution(citations):
    cnt=0
    citations.sort(reverse=True)
    
    for i in range(1,len(citations)+1):
        if i>=citations[cnt]:
            if i==citations[cnt]:
                return i
            else:
                return i-1
        cnt+=1
        
    return len(citations)