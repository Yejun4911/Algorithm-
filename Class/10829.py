'''
2021-05-23

10829번 
'''

# n = int(input())
# answer=[]
# while n!=0:
#     answer_=n%2
#     n=n//2
    
#     answer.append(answer_)

# print("".join(map(str,answer[::-1])))



num =int(input())
answer=[]
def convert(num):

    num2=int(num/2)
    answer.append(str(num%2))
    
    if num2<=1:
        answer.append(num2)
        return
    else:
        convert(num2)


convert(num)
print("".join(map(str,answer[::-1])))