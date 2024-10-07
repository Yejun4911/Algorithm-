package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] array = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 0; i<n; i++) {
            if(Integer.parseInt(array[i]) == v) result++;
        }
        System.out.println(result);

    }
}
