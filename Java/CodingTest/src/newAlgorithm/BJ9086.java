package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i<n; i++) {
            String s = br.readLine();
            arr[i] = String.valueOf(s.charAt(0)+String.valueOf(s.charAt(s.length()-1)));
        }

        for(String a : arr) {
            System.out.println(a);
        }
    }
}
