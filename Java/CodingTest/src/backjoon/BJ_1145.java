import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ_1145 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[5];
        int i =0;

        while(st.hasMoreTokens()){
            arr[i++]=Integer.parseInt(st.nextToken());
        }

        int temp = Arrays.stream(arr).min().getAsInt();

        while(true){
            int count = 0;
            for(int j=0; j<5; j++){
                if(temp%arr[j]==0) count++;
            }
            if(count>=3) break;
            temp++;
        }
        System.out.println(temp);
    }
}
