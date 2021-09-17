import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_1427 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] temp = String.valueOf(N).split("");
        Arrays.sort(temp);

        for(int i=temp.length-1; i>=0; i--){
            System.out.print(temp[i]);
        }
    }
}
