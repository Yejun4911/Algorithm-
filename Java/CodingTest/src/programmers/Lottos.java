package programmers;

import java.util.ArrayList;
import java.util.Collections;

public class Lottos {
    public static void main(String[] args) {
        solution(new int[]{0,0,0,0,0,0},new int[]{20,9,2,3,4,5});
    }
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int count = 0;
        int[] rank = {6,5,4,3,2,0};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < win_nums.length; i++) {
            list.add(win_nums[i]);
        }

        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCount++;
            }

            if (list.contains(lottos[i])) {
                count++;
            }
        }

        for (int i = 0; i < rank.length; i++) {
            int temp = count + zeroCount;
            if (count + zeroCount == 1) temp = 0;
            if (temp == rank[i]) {
                answer[0] = i+1;
            }
        }

        for (int i = 0; i < rank.length; i++) {

            if (count == 1) count = 0;

            if (count == rank[i]) {
                answer[1] = i+1;
            }
        }
        return answer;
    }
}
