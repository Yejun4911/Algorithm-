package newAlgorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[3];
        int temp = 0;
        boolean flag = false;

        for (int i=0; i<3; i++) {
            arr[i] = br.readLine();
            char c = arr[i].charAt(0);

            if(c != 'F' && c != 'B') {
                flag = true;
                temp = Integer.parseInt(arr[i]);
            }

            if(flag) {
                temp++;
            }
        }

        if(temp%3==0) {
            if(temp%5==0) {
                System.out.println("FizzBuzz");
            }else {
                System.out.println("Fizz");
            }
        } else if(temp%5==0) {
                System.out.println("Buzz");
        } else {
            System.out.println(temp);
        }

    }
}
