import javax.sound.midi.Soundbank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count=0;
        for(int i=1; i<=N; i++){
            if(i<100) {
                count++;
                continue;
            }else if(i==1000) break;
            if(confirm(i)==true) count++;
        }
        System.out.println(count);
    }
    public static Boolean confirm(int a){
        // 1 2 3
        int[] arr = new int[3];
        for(int j=0; j<arr.length; j++){
            arr[j]=a%10;
            a=a/10;
        }
        if(arr[2]-arr[1]==arr[1]-arr[0]) return true;
        else return false;

    }
}
