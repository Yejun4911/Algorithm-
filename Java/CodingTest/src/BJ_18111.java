import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int[][] round = new int[x][y];
        for(int i=0; i<x; i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                int temp = Integer.parseInt(st.nextToken());
                if(map.containsKey(temp)){
                    int cnt = map.get(temp);
                    cnt++;
                    map.put(temp,cnt);
                }else{
                    map.put(temp,1);
                }
            }
        }
        for(int key:map.keySet()){
            int value = map.get(key);

        }
    }
}
