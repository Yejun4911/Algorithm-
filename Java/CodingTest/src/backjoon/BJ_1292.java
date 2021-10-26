import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int sum = 0;
        int point = 1;
        int count = 0;
        while (count < M) {

            for (int j = 0; j < point; j++ ){
                count++;
                if(count >= N && count <= M ) {
                    sum += point;
                }
            }
            point++;
        }
        System.out.println(sum);
    }
}
