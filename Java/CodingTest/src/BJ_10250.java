import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_10250 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){

            st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int cnt = Integer.parseInt(st.nextToken());


            if(cnt%H==0){
                sb.append((H*100) + (cnt/H)).append("\n");
            }else{
                sb.append(((cnt % H)*100) + (cnt/H)+1).append("\n");
            }

        }
        System.out.println(sb);
    }
}
