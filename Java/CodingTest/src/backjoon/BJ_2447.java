import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 2021 - 09 - 13 별찍기 - 10 */
public class BJ_2447 {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        arr = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = ' ';
            }
        }

        star(0,0,N);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
        br.close();

    }

    private static void star(int x, int y, int n){
        if (n == 1) {
            arr[x][y] = '*';
            return;
        }

        n /= 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue;
                }

                star(x + (i * n), y + (j * n), n);
            }
        }
    }
}
