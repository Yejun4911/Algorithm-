from collections import deque
def solution(progresses, speeds):
    answer=[]
    answer2=[]
    pro=deque(progresses) # progresses -> queue
    sp=deque(speeds)# speeds->queue

    while(pro): # 각 progresses마다 작업 시간을 측정 100을 기점으로 시간을 측정
        cnt=0
        p=pro.popleft() 
        s=sp.popleft()
        while(True):
            if p<100: #100이 안넘으면 cnt+1로 일 수를 측정
                p+=s
                cnt+=1
            else:
                break
        answer.append(cnt)

    answer=deque(answer)

    while(answer): # 걸린 시간을 queue를 이용하여 며칠째에 몇개의 기능이 배포되었는지 확인
        cnt2=1
        a=answer.popleft()
        while(answer):
            i=0
            if a<answer[i]: #progresses를 비교하여 배포 시간을 고려
                break
            else:
                cnt2+=1
                answer.popleft()
            i+=1
        answer2.append(cnt2)

    return answer2