package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BJ_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        char[][] c = new char[5][15];
        StringTokenizer st;


        for (int i = 0; i < 5; i++) {
            String temp = br.readLine();
            for (int j = 0; j < temp.length(); j++) {
                c[i][j] = temp.charAt(j);
            }
        }

        String answer = "";

        for (int i = 0; i < c.length; i++ ) {

        }
    }
}
