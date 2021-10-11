import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BJ_1874 {
    static StringBuilder sb = new StringBuilder();
    static int pointer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            int temp =  Integer.parseInt(br.readLine());
            solve(temp);
        }
        System.out.println(sb);

    }
    private static void solve(int num){
        Stack<Integer> stack = new Stack<>();

        if(pointer<num){
            for(int i=stack.peek(); i<num; i++){
                stack.push(i);
                sb.append("+").append("\n");
            }
        }else{
            for(int i=num; i<=stack.peek(); i--){
                stack.pop();
                sb.append("-").append("\n");
            }
        }
    }
}
