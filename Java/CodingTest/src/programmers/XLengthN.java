package programmers;

public class XLengthN {
    public static void main(String[] args) {
        System.out.println(solution(2,5));
    }
    public static long[] solution(long x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++ ) {
            answer[i] = (i+1) * x;
        }
        return answer;
    }
}
