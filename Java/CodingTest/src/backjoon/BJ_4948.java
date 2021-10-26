import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] prime = new boolean[246913];

        prime[0] = prime[1] = true;


        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        while(true) {

            int N = Integer.parseInt(br.readLine());
            if(N==0) break;
            int cnt=0;

            for (int i = N+1; i <= 2*N; i++) {
                if (!prime[i]) cnt++;
            }
            System.out.println(cnt);
        }


    }
}
