'''
프로그래머스 폰켓몬
2021-07-06
'''

def solution(nums):
    answer = 0
    temp=len(nums)/2
    nums=set(nums)
    
    if len(nums)==temp:
        return temp
    elif len(nums)>temp:
        return temp
    else:
        return len(nums)