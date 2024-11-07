package programmers;

import java.util.HashMap;

public class PG_176963 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5,10,1,3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        solution(name,yearning,photo);
    }
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int count = 0;
        HashMap<String,Integer> map = new HashMap<>();

        for (int i =0; i <name.length; i++) {
            map.put(name[i],yearning[i]);
        }

        for (String[] arr : photo) {
            int temp = 0 ;
            for (String s : arr) {
                System.out.println(map.getOrDefault(s,0));
                temp += map.get(s);
            }
            answer[count++] = temp;
        }
        return answer;
    }
}
