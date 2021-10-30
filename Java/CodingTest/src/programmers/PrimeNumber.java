package programmers;

public class PrimeNumber {
    public static void main(String[] args) {
        solution(123);
    }
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                answer++;
            }
        }
        return answer;
    }
}
