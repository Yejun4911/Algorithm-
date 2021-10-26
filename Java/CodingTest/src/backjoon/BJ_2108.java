import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BJ_2108 {

    public static boolean[][] arr;
    public static int min = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        double sum=0;
        Collections.sort(list);

        for(Integer e : list){
            sum+=e;
        }

        int arr[] =new int[8001];

        for(int i=0; i<N; i++){
            arr[list.get(i)+4000]++;
        }

        int max = Arrays.stream(arr).max().getAsInt();

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(max<=arr[i]){
                list2.add(i-4000);
            }
        }

        System.out.println((int)Math.round(sum/list.size()));
        System.out.println(list.get(list.size()/2));
        if(list2.size()==1){
            System.out.println(list2.get(0));
        }else{
            System.out.println(list2.get(1));
        }
        System.out.println(Collections.max(list)-Collections.min(list));
    }
}