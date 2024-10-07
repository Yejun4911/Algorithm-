package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] zero = new int[41];
        int[] one = new int[41];
        zero[0]=1;
        zero[1]=0;
        one[0]=0;
        one[1]=1;
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i=2; i<41; i++){
            zero[i]=zero[i-1]+zero[i-2];
            one[i]=one[i-1]+one[i-2];
        }

        for(int s : arr){
            System.out.println(zero[s]+" "+one[s]);
        }


    }

}
