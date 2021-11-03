package programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class NoSameNum {
    public static void main(String[] args) {
        solution(new int[]{1,1,1,3});
    }
    public static int[] solution(int []arr) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        int preNum = 10;
        for (int i = 0; i < arr.length; i++) {
            if (preNum != arr[i]) {
                list.add(arr[i]);
            }
            preNum = arr[i];

        }
        answer = new int[list.size()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
