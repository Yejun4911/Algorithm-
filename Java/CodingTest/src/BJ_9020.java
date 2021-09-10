import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] prime = new boolean[10001];

        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        int T = Integer.parseInt(br.readLine());


        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            int x = n/2;
            int y = n/2;

            while(true){

                if(!prime[x] && !prime[y]){
                    if(x+y==n){
                        System.out.println(x+" "+y);
                        break;
                    }

                }else{
                    x--;
                    y++;
                }
            }
        }
    }
}
