import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1011 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());

            int dis = Y-X;

            int max = (int)Math.sqrt(dis);

            if(max==Math.sqrt(dis)){
                sb.append((max*2)-1).append("\n");
            }else if(dis<=max*max+max){
                sb.append((max*2)).append("\n");
            }else{
                sb.append((max*2)+1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
