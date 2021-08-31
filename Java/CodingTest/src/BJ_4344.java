import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr;
        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i=0; i<C; i++){
            double sum=0;
            st = new StringTokenizer(br.readLine());
            int temp=Integer.parseInt(st.nextToken());
            arr = new int[temp];

            for(int j=0; j<temp; j++){
                int num = Integer.parseInt(st.nextToken());
                arr[j]=num;
                sum+= num;
            }

            double avg = (sum/temp);
            double cont = 0;

            for (int k=0; k<temp; k++){
                if(arr[k]>avg){
                    cont++;
                }
            }
            System.out.printf("%.3f%%\n",(cont/temp)*100);
        }
    }
}
