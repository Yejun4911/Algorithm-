package backjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
/* 21-10-20  */
public class BJ_1018 {
    static char[][] arr;
    static int min = 64;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];

        for(int i=0; i<N; i++){ // 입력 값을 배열에 저장
            String temp = br.readLine();
            for(int j=0; j<M; j++){
                arr[i][j]=temp.charAt(j);
            }
        }

        int N_row = N - 7; //  브루트 포스하기 위해 8*8의 모든 영역을 조회
        int M_col = M - 7; //

        for (int i = 0; i < N_row; i++) { // 모든 영역을 조회하기 위해, 시작점 설정
            for (int j = 0; j < M_col; j++) {
                chess(i, j);
            }
        }
        System.out.println(min);
    }
    private static void chess(int x,int y){
        char fristColor = arr[x][y]; // 첫번째 값 저장
        int count = 0;
        for(int i=x; i<x+8; i++){ // 시작지점 부터 8*8 조회
            for(int j=y; j<y+8; j++){
                if(fristColor!=arr[i][j]) count++; // 첫번째 값과 다른 경우 count++

                if(fristColor=='B') fristColor='W'; // fristColor 색을 바꿔줌, 다음 값과 비교하기 위해
                else fristColor='B';
            }
            if(fristColor=='B') fristColor='W';
            else fristColor='B';
        }
        count = Math.min(count,64-count); // white, black 둘 중 어느 색으로 바꿔야 할지 최소 값 검색

        min = Math.min(min,count);
    }
}
