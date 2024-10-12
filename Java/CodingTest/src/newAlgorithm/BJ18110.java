package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i =0; i<n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int m = (int) Math.round((n *0.3)/2);

        Arrays.sort(arr);
        int avg = 0;
        for(int i = m; i < n-m; i++) {
            avg += arr[i];
        }
        System.out.println(Math.round((double)avg/(n-m*2)));

    }
}
