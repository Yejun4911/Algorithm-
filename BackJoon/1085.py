'''
직사각형에서 탈출
1085번
2021-07-31

'''

x,y,w,h = input().split();


print(min(int(x),int(y),abs(int(x)-int(w)),abs(int(y)-int(h))))