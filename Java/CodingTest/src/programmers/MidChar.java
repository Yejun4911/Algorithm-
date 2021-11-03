package programmers;

public class MidChar {
    public static void main(String[] args) {
        solution("abcd");
    }
    public static String solution(String s) {
        String answer = "";

        if (s.length() % 2 == 1) {
            answer += s.charAt((s.length() / 2));
        } else {
            answer += s.charAt((s.length() / 2) - 1);
            answer += s.charAt((s.length() / 2));
        }
        return answer;
    }
}
