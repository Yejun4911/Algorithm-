package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BJ1157 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        N = N.toLowerCase();

        for (int i = 0; i < N.length(); i++) {
            hashMap.put(N.charAt(i), hashMap.getOrDefault(N.charAt(i),0)+1);
        }
        int maxValue = hashMap.values()
                .stream()
                .max(Integer::compare)
                .orElseThrow();
        long count = hashMap.values().stream()
                .filter(value -> value == maxValue)
                .count();
        System.out.println((count > 1) ? "?" : getKeyByValue(maxValue));
    }
    public static String getKeyByValue(HashMap<String, Integer> map, int value) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }
        return "-1"; // 값이 없을 때의 기본 반환값
    }
}
