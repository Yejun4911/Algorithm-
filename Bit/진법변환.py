# 문제
# B진법 수 N이 주어진다. 이 수를 10진법으로 바꿔 출력하는 프로그램을 작성하시오.

# 10진법을 넘어가는 진법은 숫자로 표시할 수 없는 자리가 있다. 이런 경우에는 다음과 같이 알파벳 대문자를 사용한다.

# A: 10, B: 11, ..., F: 15, ..., Y: 34, Z: 35


# # N ** i  --> n의 i제곱 
# # abs 절대값

import sys

B,N = input().split()
N=int(N)
B=B[::-1] # B의 값을 역순으로 받아서 자릿수를 확인.
answer=[]

def convert(n): # 10 이상 A:10 B:11~ Z:35 이상의 값들이 나왔을때 아스키코드로 변환 후 A와의 차이 값을 구해서 10을 더해 각 자릿수의 10진수 값을 찾는다.
    a = ord("A")
    n2 = abs(n-a)
    return 10+n2

for i in range(len(B)): # 아스키 코드로 변경후 65이상 즉 대문자 "A"이상의 값들만 convert를 통하여 10진수의 값을 찾을 수 있도록 하고 각 자릿수의 제곱을 이용하여 10진수로 변환.
    
    if ord(B[i]) > 64:    
        s = ord(B[i])
        s=convert(s)
        y = N ** i
        answer.append(s*y)
    else:
        y = N ** i
        answer.append(int(B[i])*y)

print(sum(answer))

