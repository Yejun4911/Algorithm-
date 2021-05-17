'''
2021-05-17

2562번 
'''
max_list=[]
for i in range(9):
    max_list.append(int(input()))

print(max(max_list))
print(max_list.index(max(max_list))+1)