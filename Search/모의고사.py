def solution(answers):
    answer=[] 
    f = [1,2,3,4,5] # 각 학생의 번호의 순환(?)을 저장
    s = [2,1,2,3,2,4,2,5] 
    t = [3,3,1,1,2,2,4,4,5,5]
    score=0
    score2=0
    score3=0
    for i in range(len(answers)): #답과 각 학생들의 찍는 답(?)을 비교하여 학생 별 score+=1해준다.
        if answers[i]==f[i%5]:
            score+=1
        if answers[i]==s[i%8]:
            score2+=1
        if answers[i]==t[i%10]:
            score3+=1
    list = [score,score2,score3]  # for문이 끝난 뒤 학생들의 점수를 List로 변환
    max_=max(list) # max 값을 찾은 뒤 for문을 이용하여 인덱스의 학생이 MAX값이면 answer에 저장 결과적으로 모두 같은 결과가 나와도 순서대로.
    cnt=1
    for i in list:
        if max_==i:
            answer.append(cnt)
        cnt+=1
            
    return answer