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
        int count = 0;
        int T=2;
        while(true){
            if(count==N) break;

            if(T%2==0){
                for(int i=1; i<=T-1; i++){
                    count++;
                    if(count==N){
                        System.out.println((T-i)+"/"+(i));
                        break;
                    }
                }
            }else{
                for(int i=1; i<=T-1; i++){
                    count++;
                    if(count==N){
                        System.out.println((i)+"/"+(T-i));
                        break;
                    }

                }
            }
            T++;
        }
    }
}
