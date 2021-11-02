package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrDivisor {
    public static void main(String[] args) {
        solution(new int[]{5,9,7,10}, 5);
    }
    public static int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.size() == 0) return new int[]{-1};
        answer = new int[list.size()];



        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);


        return answer;
    }
}
