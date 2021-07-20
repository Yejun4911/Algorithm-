def solution(left, right):
    answer = 0
    dic={}
    for i in range(left,right+1):
        for j in range(1,i+1):
            if i%j==0:
                if i in dic:
                    dic[i]+=1
                else:
                    dic[i]=1
                    
    for x,y in dic.items():
        if y%2==0:
            answer+=x
        else:
            answer-=x
    return answer