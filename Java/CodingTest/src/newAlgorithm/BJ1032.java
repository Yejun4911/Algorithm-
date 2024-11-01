package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ1032 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
        int N = Integer.parseInt(br.readLine());

        String[] list = new String[N];

        for (int i = 0; i < N; i++) {
            list[i] = br.readLine();
        }

        char[] temp = list[0].toCharArray();
        for (int i = 1; i <N; i++ ){

            for (int j =0; j<temp.length; j++) {
                if (temp[j] != list[i].charAt(j)) {
                    temp[j] = '?';
                }
            }
        }
        System.out.println(temp);
    }
}
