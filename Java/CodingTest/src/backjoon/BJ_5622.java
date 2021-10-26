import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp = br.readLine();

        String[] arr = temp.split("");
        int count=0;
        for(String s : arr){
            if(s.equals("A") || s.equals("B") || s.equals("C")){
                count+=2;
            }else if(s.equals("D") || s.equals("E") || s.equals("F")){
                count+=3;
            }else if(s.equals("G") || s.equals("H") || s.equals("I")){
                count+=4;
            }else if(s.equals("J") || s.equals("K") || s.equals("L")){
                count+=5;
            }else if(s.equals("M") || s.equals("N") || s.equals("O")){
                count+=6;
            }else if(s.equals("P") || s.equals("Q") || s.equals("R") || s.equals("S")){
                count+=7;
            }else if(s.equals("T") || s.equals("U") || s.equals("V")){
                count+=8;
            }else if(s.equals("W") || s.equals("X") || s.equals("Y") || s.equals("Z")){
                count+=9;
            }
            count++;
        }
        System.out.println(count);

    }
}
