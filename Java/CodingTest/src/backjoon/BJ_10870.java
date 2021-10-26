import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* 2021 - 09 - 13 피보나치 */
public class BJ_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(num(N));
        br.close();
    }

    private static int num(int n){ //피보나치
        if(n==0){ // 0이면 0을 반환
            return 0;
        }else if(n<=2){ //2보다 작거나 똑같은 값이 들어오면 1로 반환.
            return 1;
        }
        return num(n-1) + num(n-2);
    }
}
