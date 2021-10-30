package programmers;

public class CaesarPassword {
    public static void main(String[] args) {
        solution("AB",1);
    }
    public static String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int temp = (int)s.charAt(i);
            if (temp >= 65 && temp <= 90) {
                temp += n;
                if (temp > 90) temp -= 26;
                answer += (char) temp;
            } else if (temp >= 97 && temp <= 122) {
                temp += n;
                if (temp > 122 ) temp -= 26;
                answer += (char) temp;
            } else {
                answer += " ";
            }
        }
        return answer;
    }
}
