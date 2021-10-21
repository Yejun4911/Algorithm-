import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_2805 {
    static int[] treeList;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        treeList = new int[N];
        st = new StringTokenizer(br.readLine());

        for ( int i = 0; i < N; i++ ){
            treeList[i] = Integer.parseInt(st.nextToken());
            if( treeList[i] > max ) max = treeList[i];
        }

        Arrays.sort(treeList);

        int high = max;
        int low = 0;

        while( low < high ) {
            int mid = ( low + high ) / 2;
            long sum = 0;

            for (int i = 0 ; i < treeList.length; i++) {
                if ( mid < treeList[i] ) {
                    sum += treeList[i] - mid;
                }
            }

            if ( M > sum ) high = mid ;
            else low = mid + 1;
        }

        System.out.println(low-1);
    }
}
