def solution(s):
    answer = []
    dic = {'zero':'0','one':'1','two':'2','three':'3','four':'4','five':'5','six':'6','seven':'7','eight':'8','nine':'9'}
    
    
    for key, value in dic.items():
        s = s.replace(key,value)
        print(key,value)
        print(s)

    
    return int(s)