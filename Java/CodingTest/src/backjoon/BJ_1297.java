import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1297 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String[] temp = br.readLine().split(" ");

        int diagonal = Integer.parseInt(temp[0]);
        int height = Integer.parseInt(temp[1]);
        int width = Integer.parseInt(temp[2]);

        double res = Math.sqrt(Math.pow(diagonal,2)/(Math.pow(height,2)+Math.pow(width,2)));
        System.out.print((int)Math.floor(res*height)+" ");
        System.out.println((int)Math.floor(res*width));
    }
}
