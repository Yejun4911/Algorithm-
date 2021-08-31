import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br2.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br2.readLine());

        a=a*3600;
        b=b*60;
        c=c*60;
        int time = a+b+c;
        int hour = time/3600;
        if(hour>=24) hour-=24;
        System.out.println(hour+" "+time%3600/60);

    }
}
