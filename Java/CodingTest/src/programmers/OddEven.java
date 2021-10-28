package programmers;

public class OddEven {
    public static void main(String[] args) {
        solution(3);
    }
    public static String solution(int num) {
        String answer = "";

        if (num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        return answer;
    }
}
