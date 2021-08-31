def solution(phone_book):
    answer = True
    hash_map={}
    for phone_number in phone_book:
        hash_map[phone_number] = 1
    
    
    for a in phone_book:
        temp=""
        for b in a:
            temp+=b
            if temp in hash_map and temp != a:
                answer = False
    return answer