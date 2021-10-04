import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_11399 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st =new StringTokenizer(br.readLine());
        int[] people = new int[n];
        int point=0;

        while(st.hasMoreTokens()){
            people[point]=Integer.parseInt(st.nextToken());
            point++;
        }

        Arrays.sort(people);

        int sum =0;
        int total=0;

        for(int i=0; i<n; i++){
            sum+=people[i];
            total+=sum;
        }
        System.out.println(total);
    }
}
