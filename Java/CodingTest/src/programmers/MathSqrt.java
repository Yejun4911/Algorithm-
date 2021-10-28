package programmers;

public class MathSqrt {
    public static void main(String[] args) {
        solution(121);
    }
    public static long solution(long n) {
        long answer = 0;
        if ((int)Math.sqrt(n) == Math.sqrt(n)) {
            long temp = (long)Math.sqrt(n);
            temp++;
            answer = temp * temp;
        } else {
            answer = -1;
        }
        return answer;
    }
}
