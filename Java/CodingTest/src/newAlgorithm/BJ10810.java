package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < m; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int j = Integer.parseInt(st2.nextToken());
            int k = Integer.parseInt(st2.nextToken());
            int l = Integer.parseInt(st2.nextToken());

            for (j=j; j < k; j++) {
                arr[j-1] = l;
            }
            if (j==k) arr[j-1] = l;


        }
        for(int a : arr) {
            System.out.print(a+" ");
        }



    }
}
