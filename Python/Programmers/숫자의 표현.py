def solution(n):
    answer = 0
    start=1
    cnt=1
    sum=0
    while start<=n:
        sum+=cnt
        if sum==n:
            sum=0
            answer+=1
            start+=1
            cnt=start
        elif sum>n:
            sum=0
            start+=1
            cnt=start
        cnt+=1
    return answer