'''
2021-05-17
1546번 백준


세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.

'''

n = int(input())
M = list(map(int,input().split()))
result = []
max_=max(M)

for i in M:
    result.append(i/max_*100)

print(sum(result)/len(result))

