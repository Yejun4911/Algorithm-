package programmers;

public class NumberSum {
    public static void main(String[] args) {
        solution(234);
    }
    public static int solution(int n) {
        int answer = 0;
        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}
