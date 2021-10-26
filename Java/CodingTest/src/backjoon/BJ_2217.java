import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        int[] rope = new int[k];

        for (int i = 0; i < k; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);
        int max = 0;

        for (int i = 0; i < k; i++) {
            int temp = rope[i] * (rope.length-i);
            max = Math.max (temp, max);
        }

        System.out.println(max);


    }
}
