def solution(bridge_length, weight, truck_weights):
    q=[0]*bridge_length # 다리 길이 만큼 list 생성
    sec=0 # 시간 측정
    
    while q:  # List q의 내용이 있으면 반복
        sec+=1 #1초 증가
        q.pop(0) #해당 다리의 트럭을 올리기 위해 0을 pop
        if truck_weights:
            if sum(q)+truck_weights[0]<=weight: #현재 다리위의 있는 트럭의 무게를 측정 하여 다음 트럭을 올리거나 비어있는 상태를 유지
                q.append(truck_weights.pop(0))
            else:
                q.append(0)
    return sec