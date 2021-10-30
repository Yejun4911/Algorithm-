package programmers;

public class NumberReserve {
    public static void main(String[] args) {
        solution(12345);
    }
    public static int[] solution(long n) {
        int[] answer = {};

        String[] str = String.valueOf(n).split("");

        answer = new int[str.length];

        int pointer = 0;
        for(int i = str.length-1; i >= 0; i--) {
            answer[pointer] = Integer.parseInt(str[i]);

            pointer++;
        }

        return answer;
    }
}
