import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        int count = 0;
        while(X!=1){

            if (X % 3 == 0) {
                X /= 3;
                count++;
            } else if ( X % 2 == 0) {
                X /= 2;
                count++;
            } else {
                X--;
                count++;
            }

        }

        System.out.println(count);
    }
}
