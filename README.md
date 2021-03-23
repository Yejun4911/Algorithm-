# stack
스택이란?
영어로 Stack '쌓다' 라는 의미

프로그래밍에서 목록 혹은 리스트에서 접근이 한쪽에서만 가능한 구조 
Last-In, First-Out

pop - 값 입력 pop()

push - 값 출력 (list.append)

peek - 값 조회 

스택 구현 방법

1) 직접 구현 
2) 이미 구현된 클래스 import 
3)  List를 스택으로 구현
 
ex)

push(1),push(5),push(10) ---->[1,5,10]

pop() ---> [1,5]

peek() --->[5]

# queue
영어로 Queue '일이 처리되기를 기다리는 리스트' 라는 의미
프로그래밍에서 목록 혹은 리스트에서 접근이 양쪽에서 가능한 구조로
First-In, First-Out

put - 입력
peek - 조회
get - 출력

큐의 구현 방법

1) 직접 구현
2) 이미 구현된 클래스 import 
3) List를 스택으로 구현

ex) 

put(1), put(5), put(10) ---> [1,5,10]

get() --->[5,10]

peek() --->[5]
