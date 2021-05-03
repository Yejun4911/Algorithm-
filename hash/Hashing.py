import sys

n = sys.stdin.readline().rstrip()
a = sys.stdin.readline().rstrip()


cnt=0
sum2=0
for i in a:
    back=31**cnt
    sum2=sum2+((ord(i)-96)*back)
    cnt+=1
print(sum2 %  1234567891) 