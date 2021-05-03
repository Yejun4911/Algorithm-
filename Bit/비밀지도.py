# 문제
# 네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다. 
# 그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다. 
# 다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.

def solution(n, arr1, arr2):
    temp = []
    arr=arr1+arr2 # 리스트를 하나로 합침
    array = [[" "]*n for i in range(n)] # 2차원 배열 생성 n의 크기만큼
    answer=[]
    cnt=0

    for i in arr: # arr 리스트에서 각 요소를 꺼내 bin()함수를 이용해 2진수로 변경 
        i=bin(i)[2:]
        if len(i)< n: # i의 길이가 n보다 작을 경우 i 앞에 그 크기만큼 0을 삽입
            tmp=n-len(i)
            i="0"*tmp+i
        for j in range(len(i)): # 해당 결과로 반환된 문자열을 하나하나 검색하여 해당 인덱스가 1일 경우 #으로 변경
            if i[j]=="1":
                array[cnt%n][j]="#"

        cnt+=1

    for i in array: # .join() 함수를 이용해요 리스트를 합쳐줌
        answer.append("".join(i))
    return answer


# "".join() --> 리스트를 합쳐줌 
#
# zfill() ---> "2".zfill(3) ---> 002 # 자동으로 0 채워주는 것 같음.

# rjust() ---> "2".rjust(3, "0") ---> 002

# zip() 은 동일한 개수로 이루어진 자료형을 묶어 주는 역할을 하는 함수이다.