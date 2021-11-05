package programmers;

public class PlusMinus {
    public static void main(String[] args) {
        solution(new int[]{4,6,7},new boolean[]{true,true,false});
    }
    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < signs.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            } else{
                answer -= absolutes[i];
            }
        }
        return answer;
    }
}
