import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int[] arr = new int[10];
        int count = 1;
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i)=='9') {
               arr[6]++;
            } else {
                arr[N.charAt(i)-'0']++;
            }
        }

        if ( arr[6] % 2 == 0 ) {
           arr[6] = arr[6] / 2;
        } else {
            arr[6] = arr[6] / 2 + 1;
        }

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
        }
        System.out.println(max);
    }
}
