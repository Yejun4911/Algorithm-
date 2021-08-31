import java.io.*;
import java.util.StringTokenizer;

public class BJ_1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        int temp = N;
        int count = 0;
        while(true){
            N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
            count++;

            if(temp==N){
                break;
            }
        }
        System.out.println(count);
    }
}
