import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_9012 {
    static String[] arr;
    static int pointer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++){

            String[] temp = br.readLine().split("");
            arr = new String[temp.length];
            pointer = 0;
            for(int j=0; j<temp.length; j++){
                push(temp[j]);
            }
            if(pointer>0) sb.append("NO").append("\n");
            else sb.append("YES").append("\n");
        }
        System.out.println(sb);

    }
    private static void push(String s){
        if(pointer>0){
            if((arr[pointer-1].equals("(") && s.equals(")"))){
                arr[pointer-1]="";
                pointer--;
            }else{
                arr[pointer++]=s;
            }
        }else{
            arr[pointer++]=s;
        }
    }
}
