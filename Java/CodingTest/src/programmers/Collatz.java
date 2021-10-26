package programmers;

public class Collatz {
    public static void main(String[] args) {
        solution(6);
    }
    public static int solution(int num) {
        int answer = 0;

        while (num!=1) {

            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1){
                num = (num * 3) + 1;
            }

            answer++;

            if (answer == 500) {
                answer = -1;
                break;
            }

        }
        return answer;
    }

}
