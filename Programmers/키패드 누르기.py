def solution(numbers, hand):
    answer = ''
    right=[3,6,9]
    left=[1,4,7]
    center=[2,5,8,0]
    
    left_hand=[10]
    right_hand=[11]
    
    for i in numbers:
        if i in right:
            answer+='R'
            right_hand.append(i)
        elif i in left:
            answer+='L'
            left_hand.append(i)
        elif i in center:
            temp=left_hand[-1:]
            temp2=right_hand[-1:]
            
            if temp[0]-i>temp2[0]-i:
                answer+='R'
            elif temp[0]-i<temp2[0]-i:
                answer+='L'
            else:
                answer+=hand[:1].upper()
            
    print(answer)
    return answer

solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5],"right")