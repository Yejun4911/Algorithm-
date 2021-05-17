# stack
* 스택이란?
 - 영어로 Stack '쌓다' 라는 의미

* 프로그래밍에서 목록 혹은 리스트에서 접근이 한쪽에서만 가능한 구조 
	* Last-In, First-Out
		* pop - 값 입력 pop()
		* push - 값 출력 (list.append)
		* peek - 값 조회 

* 스택 구현 방법
	* 1) 직접 구현 
	* 2) 이미 구현된 클래스 import 
	* 3)  List를 스택으로 구현
	* ex)
		* push(1),push(5),push(10) ---->[1,5,10]	
		* pop() ---> [1,5]
		* peek() --->[5]

# queue
- 영어로 Queue '일이 처리되기를 기다리는 리스트' 라는 의미, 프로그래밍에서 목록 혹은 리스트에서 접근이 양쪽에서 가능한 구조로
* First-In, First-Out
	* put - 입력
	* peek - 조회
	* get - 출력

* 큐의 구현 방법
	* 1) 직접 구현
	* 2) 이미 구현된 클래스 import 
	* 3) List를 스택으로 구현
	* ex) 
		* put(1), put(5), put(10) ---> [1,5,10]
		* get() --->[5,10]
		* peek() --->[5]


# 탐색

* 많은 데이터속에서 원하는 데이터를 찾는것으로 웹에서 특정문자를 가진 웹 문서를 찾거나 신용카드나 버스카드 역시 검색 알고리즘을 사용한다.

## 탐색 종류
* 완전탐색, 이분탐색, 깊이우선탐색, 너비우선탐색, 문자열탐색, KMP, BM

## 완전탐색

* 브루트 포스라고도 불리며 컴퓨터의 빠른 계산 성능을 활용하여 가능한 모든 경우의 수를 탐색하는 효율성 관점에서 최악의 방법 (풀리지 않는 방법이 없다)
* 완전탐색 구현 방법
1) 반복문 
   - 전체의 데이터를 순서대로 조회 	 
2) 재귀함수 -> 동적계획법, 백트래킹, 탐욕법으로도 활용
   - 쉽게 무한루프에 빠지는 경우가 있으며, 자기 자신을 호출하는 방법

## 이분탐색

 * 이진검색이라고도 표현하며 오름차순으로 정렬된 리스트에서 특정 값의 위치를 찾는 알고리즘, 중간의 값을 선택하여 찾고자 하는 값과의 크기를 비교

# 깊이우선탐색

* Depth Frist Saerch의 약자로 넓이 우선 탐색을 의미, 하나의 경우의 수에 대하여 모든 경우의 수를 조사하고 다음 경우의 수를 조사하면서 해를 찾는 과정

# 너비우선탐색(BFS)

* Breadth first Search의 약자로 넓이 우선탐색을 의미, 하나의 경우의 수에 대한 다음 단계의 모든 경우의 수를 조사하면서 해를 찾는과정



# 진법이란 ? 
- 수를 셀 때 자릿수가 올라가는 단위를 기준으로 하는 셈법의 총칭 사용하는 숫자의 개수가 진법의 숫자를 의미
- 진법을 왜 사용할까?
	- CPU -> 0,1를 활용
- 10진법 -> 2진법
	- 10(10) 2로 나누어 1010(2)
	- bin(2진법 으로 변환하는 함수)
- 10진법 -> 8진법
	- 95(10) 8로 나누어 137(8)
	- oct(8진법으로 변환하는 함수)
- 10진법 -> 16진법 (1,2,3,4,5,6,7,8,9,10,A,B,C,D,E,F)
	- 350(10) 16로 나누어 15e(16)
	- hex(16진법으로 변환하는 함수)
- 2진법 -> 10진법 
	- int()함수로 변경가능.

* 비트연산이란?
- 한개 혹은 두 개의 이진수에 적용되는 연산
- and, or, xor, not, shift
* and
	- 둘 다 1일 경우 1, 아니면 0을 반환한다
* not
	- 비트 반전 연산자로 1은 0으로 0은 1로 변환한다.
	- 2진수의 음수 0b1111 => -1
	- 음수의 표현을 처리하기 위함
	- Not 1을 더한뒤에 부호를 바꿔준다.
* Shift(<<, >>)
	- < < 비트 이동 연산자로 왼쪽으로 주어진 수만큼 옮긴다
	- > > 비트 이동 연산자로 오른쪽으로 주어진 수만큼 옮긴다
* 비트연산 활용
	 1) 컴퓨터 연산을 위한 비트 필드
	 2) 데이터의 압축 및 암호화
	 3) 유한 상태 기계
	 4) 컴퓨터 통신을 위한 포트 및 소켓
	  
# Hash
* 데이터를 다루는 기법 중 하나로 검색과 저장이 아주 유용한 구조 key와 value 쌍으로 데이터를 저장한다.
* 임의의 길이를 갖는 메시지를 입력받아 고정된 길이의 해시값을 출력하는 함수
* Python -> 딕셔너리 사용

# 재귀함수
* 메소드 혹은 함수의 내부에서 자기자신의 메소드 혹은 함수를 다시 호출하는 함수
* 코드의 간결화 및 변수 사용 최소화

# 동적계획법이란
* 다이나믹 프로그래밍 라고도 불리며, 하나의 큰문제를 여러 개의 공통되는 작은 문제로 나누어서 작은 문제의 정답들을 결합하여 알고리즘을 푸는 과정
* 접근 방법
  * Bottom Up : 작은문제에서 큰 문제로 반복문 호출
  * Top Down : 큰 문제에서 작은 문제로 재귀 호출 

* 점화식
  * 수열에서 n번째 항을 이전에 나온 항들로 나타낸 공식 
  

  
