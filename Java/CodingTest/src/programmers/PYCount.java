package programmers;

public class PYCount {
    public static void main(String[] args) {
        solution("Pppyy");
    }
    static boolean solution(String s) {
        boolean answer = false;

        String[] temp = s.split("");
        int countP = 0;
        int countY = 0;

        for (int i = 0; i < temp.length; i++) {
            if (temp[i].equals("P") || temp[i].equals("p")) {
                countP++;
            } else if (temp[i].equals("Y") || temp[i].equals("y")) {
                countY++;
            }
        }

        if (countP == countY) answer = true;

        return answer;
    }
}
