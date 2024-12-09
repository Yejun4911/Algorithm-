package programmers;

public class PG_134240 {
    public static void main(String[] args) {
//        solution(solution?)
    }
    public static String solution(int[] food) {
        StringBuffer answer = new StringBuffer();

        for (int i = 1; i<food.length; i++) {

            answer.append(String.valueOf(i).repeat(food[i]/2));
        }
        StringBuffer answer2 = new StringBuffer(answer);
        return answer.append(0).append(answer2.reverse()).toString();
    }
}
