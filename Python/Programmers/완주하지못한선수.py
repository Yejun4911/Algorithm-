def solution(participant, completion):
    hash_map={}
    answer=""
    for i in participant:
        if i in hash_map:
            hash_map[i]+=1
        else:
            hash_map[i]=1
    for j in completion:
        if j in hash_map:
            hash_map[j]+=1
            
    for i in hash_map:
        if hash_map[i]%2==1:
            answer=i
    return answer