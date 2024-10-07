package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ5597 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];

        for(int i=0; i <28; i++ ){
            int n = Integer.parseInt(br.readLine());
            arr[n-1] = 1;
        }
        int answer = 0;
        int answer2 = 0;

        for(int i = 0; i<arr.length; i++) {
            if(arr[i] != 1) {
                answer = i;
                break;
            }
        }

        for(int i = arr.length-1; i>0; i--){
            if(arr[i] != 1) {
                answer2 = i;
                break;
            }
        }
        System.out.println(answer+1);
        System.out.println(answer2+1);
    }
}
