import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1436 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

        int N = Integer.parseInt(br.readLine());
        int point=665;
        int answer=0;
        while(true){
            if(answer==N) break;
            point++;
            if(String.valueOf(point).contains("666")) answer++;

        }

        System.out.println(point);

    }
}
