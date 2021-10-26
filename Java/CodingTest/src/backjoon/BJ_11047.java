import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());


        int N =Integer.parseInt(st.nextToken());
        int M =Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int cnt = 0;
        int arrCnt = N-1;
        while(M!=0){
            if(arr[arrCnt]<=M){
                cnt+=M/arr[arrCnt];
                M%=arr[arrCnt];
            }
            arrCnt--;
        }

        System.out.println(cnt);
        br.close();
    }
}
