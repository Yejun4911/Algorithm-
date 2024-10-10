package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ30802 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = 0;
        int p = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st2.nextToken());
        int P = Integer.parseInt(st2.nextToken());

        for(int i = 0; i< 6; i++ ) {
            int temp = Integer.parseInt(st.nextToken());

            t += (temp / T) + (temp % T == 0 ? 0 : 1);
        }
        System.out.println(t);
        System.out.print(n/P+" "+ n%P);


    }
}
