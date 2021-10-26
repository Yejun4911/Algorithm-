import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb= new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            que.offer(i+1);
        }
        int cnt=0;
        sb.append("<");
        while(que.size()>1){


            if(cnt==K-1){
                sb.append(que.poll()).append(", ");
                cnt=0;
            }else{
                int temp = que.poll();
                que.offer(temp);
                cnt++;
            }

        }
        sb.append(que.poll()).append('>');
        System.out.println(sb);
    }
}
