import sys

def factorial (number): # factorial 구하는 함수를 반복문을 통해 구현
    answer=1
    for i in range(1,number+1): # 인자값을 1부터 인자값 까지의 팩토리얼을 구현
        answer=answer*i
    return answer


while 1:
    answer=[]
    cnt=1 # 자릿수 확인
    n = sys.stdin.readline().rstrip()
    
    if n=='0':
        break
    for i in reversed(n): # 입력 값을 역순으로 출력하여 자릿수를 확인 한 뒤 해당 알고리즘을 구현
        i=int(i)
        answer.append(i*factorial (cnt))
        cnt+=1
        
    print(sum(answer))
    

