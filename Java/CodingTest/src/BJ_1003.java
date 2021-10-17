import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1003 {
    static int zeroCnt;
    static int oneCnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            zeroCnt=0;
            oneCnt=0;
            int temp = Integer.parseInt(br.readLine());
            int result = fibonacci(temp);

            sb.append(zeroCnt+" "+oneCnt).append("\n");
        }
        System.out.println(sb);


    }

    private static int fibonacci(int n){
        if (n == 0) {
            zeroCnt++;
            return 0;
        } else if (n == 1) {
            oneCnt++;
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
