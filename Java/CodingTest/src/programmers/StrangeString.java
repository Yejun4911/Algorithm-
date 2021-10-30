package programmers;

public class StrangeString {
    public static void main(String[] args) {
        solution("try catch");
    }
    public static String solution(String s) {
        String answer = "";
        String[] result = s.split(" ",-1);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length(); j++) {
                String temp = "";
                temp += result[i].charAt(j);

                if(j % 2 == 0) {
                    answer += temp.toUpperCase();
                } else if (j % 2 == 1){
                    answer += temp.toLowerCase();
                }
            }

            if (i == result.length - 1) {
                continue;
            }
            answer += " ";
        }
        return answer;
    }
}
