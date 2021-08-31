import java.io.*;
import java.util.StringTokenizer;

public class BJ_15596 {
    long sum(int[] a){
        long sum=0;
        for(long i : a){
            sum+=i;
        }
        return sum;
    }
}
