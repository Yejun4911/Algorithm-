'''
https://programmers.co.kr/learn/courses/30/lessons/42860
'''

import string 
def solution(name):
    answer = 0
    num=0
    
    for asc_number in name:
        if asc_number!="A":
            if ord(asc_number)-65<14:
                answer=ord(asc_number)-65
            else:
                answer=90-ord(asc_number)+1
            num+=answer+1
        else:
            continue
        print(answer)
    return num