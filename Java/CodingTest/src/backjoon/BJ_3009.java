import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList listX = new ArrayList();
        ArrayList listY = new ArrayList();
        ArrayList answer = new ArrayList();
        for(int i=0; i<3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x=Integer.parseInt(st.nextToken());
            int y=Integer.parseInt(st.nextToken());
            listX.add(x);
            listY.add(y);
        }
        Set<Integer> set = new HashSet<Integer>(listX);
        Set<Integer> setY = new HashSet<Integer>(listY);

        for(int i : set){
            int temp = Collections.frequency(listX,i);
            if(temp==1) answer.add(i);
        }
        for(int i : setY){
            int temp = Collections.frequency(listY,i);
            if(temp==1) answer.add(i);
        }

        System.out.println(answer.get(0)+" "+answer.get(1));
    }
}
