import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        if(N==1) System.out.println();
        else{
            while(N>1){
                for(int i=2; i<=N; i++){
                    if(N%i==0){
                        int temp = N%i;
                        N/=i;
                        System.out.println(i);

                        break;
                    }
                }
            }
        }
    }
}
