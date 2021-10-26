import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0; i<N; i++){
            int sum=0;
            int temp = i;
            sum+=i;
            while(temp!=0){
                sum+=temp%10;
                temp/=10;
            }
            if(sum==N){
                answer=i;
                break;
            }
        }
        System.out.println(answer);
    }
}
