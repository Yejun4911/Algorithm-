import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class BJ_10866 {
    static Deque<Integer> deque = new LinkedList<>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String temp = st.nextToken();
            int number=0;
            if(st.hasMoreTokens()) number = Integer.parseInt(st.nextToken());

            if(temp.equals("push_front")) push_front(number);
            else if(temp.equals("push_back")) push_back(number);
            else if(temp.equals("pop_front")) pop_front();
            else if(temp.equals("pop_back")) pop_back();
            else if(temp.equals("size")) size();
            else if(temp.equals("empty")) empty();
            else if(temp.equals("front")) front();
            else if(temp.equals("back")) back();

        }
        System.out.println(sb);
    }

    private static void push_front(int num){
        deque.addFirst(num);
    }
    private static void push_back(int num){
        deque.addLast(num);
    }
    private static void pop_front(){
        if(deque.isEmpty()) sb.append("-1").append("\n");
        else sb.append(deque.pollFirst()).append("\n");
    }

    private static void pop_back(){
        if(deque.isEmpty()) sb.append("-1").append("\n");
        else sb.append(deque.pollLast()).append("\n");
    }
    private static void size(){
        sb.append(deque.size()).append("\n");
    }

    private static void empty(){
        if(deque.isEmpty()) sb.append(1).append("\n");
        else sb.append(0).append("\n");
    }

    private static void front(){
        if(deque.isEmpty()) sb.append(-1).append("\n");
        else sb.append(deque.peekFirst()).append("\n");
    }

    private static void back(){
        if(deque.isEmpty()) sb.append(-1).append("\n");
        else sb.append(deque.peekLast()).append("\n");
    }
}
