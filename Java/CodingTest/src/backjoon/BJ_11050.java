import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int result = factorial(N)/(factorial(K)*factorial(N-K)); // 이항계수 공식
        System.out.println(result);

    }
    private static int factorial(int a){
        if(a<=1) return 1;
        return a*factorial(a-1);
    }
}
