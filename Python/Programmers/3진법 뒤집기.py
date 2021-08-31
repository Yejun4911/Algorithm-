def solution(n):
    answer=''
    
    while n > 0:
        
        q, r = divmod(n, 3)
        answer += str(r)
        n = q
        print(answer)
    
    return int(answer,3)