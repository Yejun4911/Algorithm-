import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
/* 못푼 문제ㅠㅠ */
public class BJ_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(st.nextToken());
            int value = num;
            int temp = num;
            if(!stack.isEmpty()) temp = stack.peek();

            stack.push(num);
            if(temp < num){
                if(cnt==i && cnt!=0){
                    sb.append(-1).append(" ");
                    cnt--;
                }
                for(int j=0; j<cnt; j++) sb.append(num).append(" ");
            }else if(temp > num){
                cnt++;
            }
        }
        sb.append("-1");
        System.out.println(sb);
    }
}
