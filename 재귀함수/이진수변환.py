num =int(input())
answer=""

def convert(num):
    global answer
    num2=int(num/2)
    answer+=str(num%2)
    
    if num2<=1:
        answer+=str(num2)
        return
    else:
        convert(num2)

convert(num)
print(int(answer[::-1]))
