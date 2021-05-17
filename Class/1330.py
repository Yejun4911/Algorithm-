'''
20201-05-10
1330 - 두수 비교하기
'''

number = input()
number_list=number.split(" ")

if int(number_list[0])>int(number_list[1]):
    print(">")
elif int(number_list[0])<int(number_list[1]):
    print("<") 
elif int(number_list[0])==int(number_list[1]):
    print("==")    