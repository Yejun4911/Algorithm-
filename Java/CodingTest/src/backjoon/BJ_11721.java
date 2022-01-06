package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int count = 1;

        for (int i = 0; i < N.length(); i++) {
            System.out.print(N.charAt(i));

            if (count == 10) {
                System.out.println();
                count = 0;
            }
            count++;
        }
    }
}
