import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            Queue<Integer> q = new LinkedList<>();
            st =  new StringTokenizer(br.readLine());
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<a; j++){
                q.add(Integer.parseInt(st.nextToken()));
            }

            for(int k=0; k<a; k++){


            }



        }
    }
}
