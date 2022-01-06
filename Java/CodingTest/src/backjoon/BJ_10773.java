package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BJ_10773 {
    static int[] arr;
    static int pointer=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];

        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp==0){
                pop();
            }else{
                push(temp);
            }
        }
        System.out.println(Arrays.stream(arr).sum());
    }
    private static void push(int num){
        arr[pointer++]=num;

    }
    private static void pop(){

        arr[pointer-1]=0;
        pointer--;

    }
}
