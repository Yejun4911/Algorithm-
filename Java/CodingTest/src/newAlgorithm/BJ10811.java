package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for(int i = 0; i <n; i++) {
            arr[i] = i+1;
        }
        for(int i = 0; i <m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st2.nextToken())-1;
            int k = Integer.parseInt(st2.nextToken())-1;

            for (int z = k, y = j; y < z; z--,y++) {
                int temp = arr[z];
                arr[z] = arr[y];
                arr[y] = temp;
             }
        }

        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}
