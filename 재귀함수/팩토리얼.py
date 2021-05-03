n = int(input())
num=1
def factorial(n):
    if n==1:
        return 1
    elif n==0:
        return 0
    else:
        global num
        num*=n
        factorial(n-1)

factorial(n)
print(num)