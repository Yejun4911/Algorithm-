import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class BJ_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        int cnt=0;
        while(cnt==N){

            System.out.println(cnt+"/"+cnt);

            cnt++;
        }

    }
}
