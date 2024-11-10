package programmers;

public class PG_155652 {
    public static void main(String[] args) {
//        solution(solution?)
    }
    public static String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            while(count<index) {
                c++;
                if (c > 'z') {
                    c = 'a';
                }
                if (skip.contains(String.valueOf(c))) {
                    continue;
                } else {
                    count++;
                }
            }
            answer += c;
        }

        return answer;
    }
}
