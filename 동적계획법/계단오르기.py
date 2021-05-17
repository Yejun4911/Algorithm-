'''
2021-05-17
백준 2579번 
계단 오르기
계단 오르기 게임은 계단 아래 시작점부터 계단 꼭대기에 위치한 도착점까지 가는 게임이다. <그림 1>과 같이 각각의 계단에는 일정한 점수가 쓰여 있는데 계단을 밟으면 그 계단에 쓰여 있는 점수를 얻게 된다
'''

up_list= []
def up(n):
    result = [] 
    for i in range(n):
        if i == 0: 
            result.append(up_list[0]) # i==0이면 첫번째 계단을 result의 추가 <계단이 1칸만 있을 경우>
            continue
        elif i == 1:
            result.append(max(up_list[0]+up_list[1],up_list[1])) # i==1이면 첫번째 계단 + 두번째 계단의 합, 바로 두칸 올라 간 경우를 비교하여 최대 값을 찾아 result에 추가
            continue
        elif i == 2:
            result.append(max(up_list[0]+up_list[2],up_list[1]+up_list[2])) # i==2이면 처음 계단을 오를때 두칸 올라간 0,2의 합 과 처음부터 두칸을 올라간뒤에 또 한칸 올라간 1,2의 합을 비교하여 최대값을 result 추가
            continue
        
        result.append(max(up_list[i]+up_list[i-1]+result[i-3],up_list[i]+result[i-2])) # 두가지의 경우를 비교 첫번째, 한칸 전 계단을 밟고 올라온 경우이며 이럴 땐 세번 연속 계단을 오룰 순 없으므로 그 이전 계단은 그 전전인 n-3번째 계단이 된다, 두번째 두칸전 계딴을 밟고 온경우이다. 이 두가지 경우를 비교하여 최대값을 찾는다.
    return result


n = int(input())
for i in range(n):
    up_list.append(int(input()))

print(up(n)[-1])
