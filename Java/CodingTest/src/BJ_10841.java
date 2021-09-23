import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_10841 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        String[][] arr = new String[N][2];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0]=st.nextToken();
            arr[i][1]=st.nextToken();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[0] == e2[0]) {
                return -1;
            } else {
                return Integer.parseInt(e1[0]) - Integer.parseInt(e2[0]);
            }
        });

        for(String[] s : arr){
            System.out.print(s[0]+" ");
            System.out.println(s[1]);
        }
    }
}
