import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class kakao {
    public static void main(String[] args) throws IOException {
        String a = "aaabbb"; //abaaba
        String temp = "";
        //1,1,1,1,1,1,2
        if (a.length() % 2 ==0) {
            temp += a.substring(a.length()/2+1,a.length());
            temp += a.substring(0,a.length()/2 -1 );
            temp += a.substring(a.length()/2-1,a.length()/2+1);
        } else {
            temp += a.substring(a.length()/2+1,a.length());
            temp += a.substring(0,a.length()/2 );
            temp += a.substring(a.length()/2,a.length()/2+1);
        }
        System.out.println(temp);
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        char c = temp.charAt(0);
        for (int i = 1; i < temp.length(); i++) {
            if (c==temp.charAt(i)) {
                count++;
            } else {
                list.add(count);
                count = 1;
            }

            if (i==temp.length()-1) {
                list.add(count);
            }
            c = temp.charAt(i);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);

        for (int s : answer) {
            System.out.println(s);
        }
    }
}
//1,1,2

