def solution(n):
    answer=''
    temp=bin(n).count('1')
    for i in range(n+1,1000000+1):
        if bin(i).count('1')==temp:
            return i
    return answer