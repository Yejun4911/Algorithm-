import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] dis = new long[N-1];
        long[] townList = new long[N];
        int disCount=0;
        int townListCnt=0;
        StringTokenizer distance = new StringTokenizer(br.readLine());

        while(distance.hasMoreTokens()){
            dis[disCount++]=Integer.parseInt(distance.nextToken());
        }

        StringTokenizer town = new StringTokenizer(br.readLine());

        while(town.hasMoreTokens()){
            townList[townListCnt++]=Integer.parseInt(town.nextToken());
        }
        long sum = 0;
        long min = townList[0];
        for(int i=0; i<N-1; i++){
            if(townList[i]<min) min = townList[i];
            sum+=min*dis[i];
        }

        System.out.println(sum);
    }
}
