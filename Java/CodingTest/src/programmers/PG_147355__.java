package programmers;

public class PG_147355__ {
    public static void main(String[] args) {
//        solution()
    }
    public static int solution(String t, String p) {
        int answer = 0;
        long pInt = Long.parseLong(p);

        for (int i = 0; i <=t.length() - p.length(); i++) {
            String a = "";
            a += t.charAt(i);

            for (int j = i+1; j<i+p.length(); j++) {
                a += t.charAt(j);
            }

            if(Long.parseLong(a) <= pInt) {
                answer++;
            }
        }
        return answer;
    }
}

