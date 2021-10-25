import sun.java2d.pipe.SpanIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1449 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 오름차순으로 정리

        int count = 0; // 테이프의 갯수 세기위해 선언.

        double temp = arr[0]-0.5+L; //초기 값 설정, 테이프 길이 범위를 설정, 좌우로 0.5씩 간격이 필요하며 그 범위 안에 값이 있으면 테이프 1개로 여러개로 막을 수 있음.

        count++;

        for ( int i = 1; i < arr.length; i++ ) { // 초기 범위 보다 배열 안의 새로운 값 범위가 더 크면, 테이프 하나로 막을 수 없어서 테이프를 하나 새롭게 부착해야한다. 그리고 비교 대상을 다시 테이프 시작 범위로 다시 설정.
            
            if( arr[i]-0.5 > temp ) {
                count++;
                temp = arr[i]-0.5+L;
            }
        }
        System.out.println(count);


    }
}
