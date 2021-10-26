import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        int M =Integer.parseInt(br.readLine());

        int sum=0;
        int min = M;

        for(int i =N; i<=M; i++){
            boolean check=false;
            if(i==1) check=true;
            for(int j=2; j<i; j++){
                if(i%j==0) {
                    check=true;
                    break;
                }
            }
            if(check==false) {
                sum+=i;
                if(min>i) min=i;
            }
        }
        if(sum==0) System.out.println(-1);
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
