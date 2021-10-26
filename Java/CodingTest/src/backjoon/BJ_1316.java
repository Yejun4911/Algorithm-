import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class BJ_1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int count = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            if (check()) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check() throws IOException {
            String arr = br.readLine();
            boolean[] alp = new boolean[26];
            int s = 0;
            for (int k = 0; k < arr.length(); k++) {
                if (s != arr.charAt(k)) {
                    if(!alp[arr.charAt(k)-'a']){
                        alp[arr.charAt(k)-'a'] = true;
                        s = arr.charAt(k);
                    }else{
                        return false;

                    }
                }
            }
            return true;
        }

    }

