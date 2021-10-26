import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BJ_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = br.readLine();
        temp=temp.replace("c=","č");
        temp=temp.replace("c-","ć");
        temp=temp.replace("dz=","d");
        temp=temp.replace("d-","đ");
        temp=temp.replace("lj","a");
        temp=temp.replace("nj","s");
        temp=temp.replace("s=","š");
        temp=temp.replace("z=","ž");
        System.out.println(temp.length());






    }
}
