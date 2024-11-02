package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PG68644 {
    public static void main(String[] args) {

        solution();
    }
    public static int[] solution(int[] numbers) {
        int[] answer = {};

        List<Integer> array = new ArrayList<>();

        for (int i =0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length-1; j++) {
                int sum = numbers[i] + numbers[j];
                if (!array.contains(sum)) { // 중복 방지
                    array.add(sum);
                }
            }
        }

        return array.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
