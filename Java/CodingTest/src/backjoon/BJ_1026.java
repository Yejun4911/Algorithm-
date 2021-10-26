import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class BJ_1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int S = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Integer[] A = new Integer[S];
        int[] B = new int[S];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < S; i++ ) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A, Collections.reverseOrder());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < S; i++ ) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(B);

        int sum = 0;
        for (int i = 0; i < S; i++) {
            sum += A[i]*B[i];
        }

        System.out.println(sum);
    }
}
