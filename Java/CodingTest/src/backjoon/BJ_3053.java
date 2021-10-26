import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_3053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double R = Integer.parseInt(br.readLine());

        String answer1 = String.format("%.6f",R*R*Math.PI);
        String answer2 = String.format("%.6f",R*R*2);

        System.out.println(answer1);
        System.out.println(answer2);
    }
}
