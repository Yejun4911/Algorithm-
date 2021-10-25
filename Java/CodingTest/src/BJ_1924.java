import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        //1,2,3,4,5,6,7
        int temp = 0;
        for (int i = 1; i < x; i++ ) {
            if ( i == 4 || i == 6 || i == 9 || i == 11 ) {
                temp += 30;
            } else if ( i == 2 ) {
                temp += 28;
            } else {
                temp += 31;
            }
        }
        temp += y;

        if ( temp % 7 == 1 ) {
            System.out.println("MON");
        } else if ( temp % 7 == 2 ) {
            System.out.println("TUE");
        } else if ( temp % 7 == 3 ) {
            System.out.println("WED");
        } else if ( temp % 7 == 4 ) {
            System.out.println("THU");
        } else if ( temp % 7 == 5 ) {
            System.out.println("FRI");
        } else if ( temp % 7 == 6 ) {
            System.out.println("SAT");
        } else {
            System.out.println("SUN");
        }
    }
}
