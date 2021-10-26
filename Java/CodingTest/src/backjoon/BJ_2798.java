import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i=0; i<arr.length; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int max = 0;
        for(int i=0; i<=arr.length-3; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    if(arr[i]+arr[j]+arr[k]>max && arr[i]+arr[j]+arr[k]<=M) max = arr[i]+arr[j]+arr[k];
                }
            }
        }

        System.out.println(max);

    }
}
