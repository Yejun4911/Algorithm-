import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BJ_4949 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            Stack<Character> stack = new Stack<>();
            String temp = br.readLine();
            if(temp.equals(".")) break;

            for(int i=0; i< temp.length(); i++){
                char s = temp.charAt(i);
                if(s=='(' || s=='['){
                    stack.push(s);
                }else if(s==')' || s==']'){
                    if(!stack.empty()) {
                        if(stack.peek()=='(' && s==')') stack.pop();
                        else if(stack.peek()=='[' && s==']') stack.pop();
                        else stack.push(s);
                    }else{
                        stack.push(s);
                    }
                }
            }
            if(stack.empty()) sb.append("yes").append("\n");
            else sb.append("no").append("\n");

        }
        System.out.println(sb);


    }
}
