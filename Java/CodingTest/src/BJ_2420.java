import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.valueOf(st.nextToken());
        long M = Long.valueOf(st.nextToken());

        System.out.println(Math.abs(N-M));
    }
}
