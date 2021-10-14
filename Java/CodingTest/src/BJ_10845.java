import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BJ_10845 {
    private static LinkedList<Integer> list = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        StringBuilder builder = new StringBuilder();

        for(int i=0 ; i<N ; i++){
            String[] input = reader.readLine().split(" ");
            switch (input[0]) {
                case "push":
                    push(Integer.parseInt(input[1]));
                    break;
                case "pop":
                    builder.append(pop()).append("\n");
                    break;
                case "size":
                    builder.append(size()).append("\n");
                    break;
                case "empty":
                    builder.append(empty()).append("\n");
                    break;
                case "front":
                    builder.append(front()).append("\n");
                    break;
                case "back":
                    builder.append(back()).append("\n");
                    break;
                default:
                    break;
            }
        }
        System.out.println(builder);
    }
    public static void push(int x){
        list.add(x);
    }

    public static int pop(){
        if(list.isEmpty())
            return -1;
        else
            return list.pollFirst();
    }

    public static int size(){
        return list.size();
    }

    public static int empty(){
        if(list.isEmpty())
            return 1;
        else
            return 0;
    }

    public static int front(){
        if(list.isEmpty())
            return -1;
        else
            return list.getFirst();
    }

    public static int back(){
        if(list.isEmpty())
            return -1;
        else
            return list.getLast();
    }
}
