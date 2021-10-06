import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_3036 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N; i++){
            int temp=gcd(arr[0],arr[i]);
            sb.append(arr[0]/temp+"/"+arr[i]/temp).append("\n");
        }
        System.out.println(sb);
    }

    private static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
