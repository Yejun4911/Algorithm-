import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2609 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int result = gcd(n,m);
        int temp = n*m;

        System.out.println(result);
        System.out.println(temp/result);



    }
    private static int gcd(int n, int m){
        if(m==0) return n;
        return gcd(m,n%m);
    }
}
