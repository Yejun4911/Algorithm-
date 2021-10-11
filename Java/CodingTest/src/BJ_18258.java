import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int last = 0;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String active = st.nextToken();
            int num = 0;
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }

            if(active.equals("push")) {
                queue.add(num);
                last=num;
            }
            else if(active.equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    queue.poll();
                }
            }
            else if(active.equals("size")) sb.append(queue.size()).append("\n");
            else if(active.equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
            else if(active.equals("front")){
                if(queue.isEmpty()) sb.append(-1).append("\n");
                else {
                    sb.append(queue.peek()).append("\n");

                }
            }
            else if(active.equals("back")){
                if(queue.isEmpty()) sb.append(-1).append("\n");
                else{
                    sb.append(last).append("\n");
                }
            }

        }
        System.out.println(sb);

    }
}
