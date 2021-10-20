import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i=0; i<9; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int[] tempArr = new int[7];

        for (int i = 0; i < arr.length-7; i++) {
            System.out.println(arr[i]);
            int point = 0;
            int sum = 0;
            for (int j = i; j < i+7; j++){
                System.out.println(arr[i]+" "+arr[j]);
                sum+=arr[j];
                tempArr[point++] = arr[j];
                if(sum == 100 && point == 6) break;
            }
        }

        for( int s : tempArr ){
            System.out.println(s);
        }
    }
}
