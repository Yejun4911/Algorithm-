package programmers;

public class PG_131705 {
    public static void main(String[] args) {

//        solution(solution)
    }

    public static int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length; i++ ) {
            for(int j = i+1; j < number.length; j++ ) {
                for(int k = j+1; k < number.length; k++ ) {
                    if(number[i]+number[j]+number[k] == 0) {
                        System.out.println(number[i]+","+number[j]+","+number[k]);
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
