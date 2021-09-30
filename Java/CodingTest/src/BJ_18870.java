import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class BJ_18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        int[] arr2 = arr.clone();

        Arrays.sort(arr);

        HashMap<Integer, Integer> hmap = new HashMap<>();

        int cnt = 0;

        for(int s : arr){
            if(!hmap.containsKey(s)) hmap.put(s,cnt++);
        }
        for(int s : arr2){
            sb.append(hmap.get(s)).append(" ");
        }
        System.out.println(sb.toString());

    }
}
