import java.io.*;
import java.util.StringTokenizer;

public class BJ_10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i=0; i<T; i++){
            st= new StringTokenizer(br.readLine(),",");

            System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
        }

    }
}
