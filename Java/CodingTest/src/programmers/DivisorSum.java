package programmers;

public class DivisorSum {
    public static void main(String[] args) {
        solution(25);
    }
    public static int solution(int n) {
        int answer = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
}
