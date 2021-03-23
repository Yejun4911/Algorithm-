
# 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 
# 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
from collections import deque # 큐를 이용하기 위해 import
def solution(prices): 
    answer = []
    prices = deque(prices) # prices를 deque화
    while prices:
        c = prices.popleft() # 
        count = 0
        for i in prices:
            if c <= i:
                count += 1
                
            else:
                count += 1
                break
        answer.append(count)
    return answer
prices=[1,2,3,2,3]
print(solution(prices))