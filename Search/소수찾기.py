from itertools import permutations
def solution(numbers):
    answer=[] 
    susn=[] #소수를 찾기위함
    cnt=0 #소수를 찾기위함
     
    for i in range(1,len(numbers)+1): # numbers 만들 수 있는 수의 조합을 찾기 위해 permutations를 이용, 반복문을 통해 numbers길이 즉 자릿수 만큼 조합을 생성 투플로 리스트가 생성되기 때문에 .join을 통해 묶어주고 int형 변환
        arr=list(permutations(numbers, i))
        for j in range(len(arr)): 
            num = int(''.join(arr[j]))
            answer.append(num)
    answer=set(answer) # 중복제거

    for i in answer:# 소수찾기
        count=1
        for j in range(2,i):
            if i%j==0:
                count=0
                break
        if count==1 and i>1:
            susn.append(i)
            cnt+=1
            
    return cnt