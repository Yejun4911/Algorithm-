import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_9461 {
    static long[] dp = new long[100001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        dp[0]=1L;
        dp[1]=1L;
        dp[2]=1L;

        for(int i=0; i<T; i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(p(n-1)).append("\n");
        }
        System.out.println(sb);


    }
    static long p(int N){

        if(dp[N]==0) dp[N]=p(N-2)+p(N-3);
        return dp[N];
    }
}
