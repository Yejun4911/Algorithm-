import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        long sum = 0;
        int i = 0;
        while (true) {
            if (sum + i + i+1 > S ) {
                sum += S-sum;
            } else {
                sum += i;
            }

            if( sum >= S ) {
                break;
            }

            i++;
        }
        System.out.println(i);
    }
}
