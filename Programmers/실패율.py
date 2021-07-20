def solution(N, stages):
    
    dic={}
    for i in range(1,N+1):
        if len(stages) == 0:
            dic[i] = 0
            continue
        dic[i]=stages.count(i)/len(stages)
        remove_set={i}
        stages = [i for i in stages if i not in remove_set]


    return sorted(dic,key=lambda x: dic[x],reverse=True)