import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList arr = new ArrayList();
        int a = Integer.parseInt(br.readLine());
        String b=br.readLine();
        String[] temp = b.split("");
        arr.add(a*Integer.parseInt(b));
        for(String i : temp){
            arr.add(Integer.parseInt(i)*a);
        }

        for(int j=arr.size()-1; j>=0; j--){
            System.out.println(arr.get(j));
        }


    }
}
