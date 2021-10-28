package programmers;

import java.util.ArrayList;

public class MinDelete {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{4,3,2,1}));
    }
    public static int[] solution(int[] arr) {
        int[] answer;
        ArrayList<Integer> list = new ArrayList<>();
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
            if(min > arr[i]) {
                min = arr[i];
            }
        }

        list.remove(new Integer(min));
        answer = new int[arr.length-1];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        if (arr.length <= 1) {
            arr[0] = -1;
            return arr;
        } else {
            return answer;
        }

    }
}
