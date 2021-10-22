import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_3085 {
    static char[][] arr;
    static int N;
    static int count = 1;
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new char[N][N];

        for ( int i = 0; i < N; i++ ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            for ( int j = 0; j < N; j++ ) {
                arr[i][j] = temp.charAt(j);
            }
        }

        for ( int i = 0; i < N; i++ ) {
            for (int j = 0; j < N - 1; j++ ) {
                if (arr[i][j+1] != arr[i][j]) {
                    char temp = arr[i][j+1];
                    arr[i][j+1] = arr[i][j];
                    arr[i][j] = temp;
                    search();
                    arr[i][j] = arr[i][j+1];
                    arr[i][j+1] = temp;
                }
            }
        }


        for ( int i = 0; i < N-1; i++ ) {
            for (int j = 0; j < N; j++ ) {
                if (arr[i+1][j] != arr[i][j]) {
                    char temp = arr[i+1][j];
                    arr[i+1][j] = arr[i][j];
                    arr[i][j] = temp;
                    search();
                    arr[i][j] = arr[i+1][j];
                    arr[i+1][j] = temp;
                }
            }
        }
        System.out.println(max);
    }
    static void search(){
        for (int i = 0; i < N; i++ ) {
            for (int j = 0; j < N-1; j++ ) {
                if( arr[i][j] == arr[i][j+1] ){
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(count,max);
            }
            count = 1;
        }

        for (int i = 0; i < N; i++ ) {
            for (int j = 0; j < N-1; j++ ) {
                if( arr[j][i] == arr[j+1][i] ){
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(count,max);
            }
            count = 1;
        }
    }
}
