package programmers;

import java.util.Arrays;
import java.util.Collections;

public class ReversOrder {
    public static void main(String[] args) {
        solution(118372);
    }
    public static long solution(long n) {
        String arr[]=String.valueOf(n).split("");

        long answer = 0;


        Arrays.sort(arr, Collections.reverseOrder());

        String temp = "";

        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }

        answer = Long.parseLong(temp);
        return answer;
    }
}
