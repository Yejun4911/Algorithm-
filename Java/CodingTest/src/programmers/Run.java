package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Run {
    public static void main(String[] args) {
//
        String[] arr = {"mumu", "soe", "poe", "kai", "mine"};
        String[] arr2 = {"kai", "kai", "mine", "mine"};
        System.out.println(Arrays.toString(solution(arr, arr2)));
    }
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = players;
        HashMap<String,Integer> map = new HashMap<>();

        for (int i =0; i<players.length; i++) map.put(players[i],i);


        for (String s : callings) {

            int index = map.get(s);
            String name = players[index-1];

            answer[index-1]= answer[index];
            answer[index] = name;

            map.put(answer[index-1], index-1);
            map.put(answer[index], index);
        }
        return answer;
    }
}
