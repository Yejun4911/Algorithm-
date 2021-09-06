import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int room=2;
        int roomCnt=1;

        int N = Integer.parseInt(br.readLine());
        if(N==1){
            System.out.println(1);
        }
        else{
            while(room<=N){
                room=room+(6*roomCnt);
                roomCnt++;
            }
            System.out.println(roomCnt);
        }
    }
}
