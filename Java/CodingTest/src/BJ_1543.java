import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String file = br.readLine();
        String search = br.readLine();
        int count = 0;

        for (int i = 0; i < file.length() - search.length() + 1; i++ ) { // 검사 할 수 있는 범위까지만 반복문 실행
            if(file.substring(i,i+search.length()).equals(search)) { // substring을 이용하여 인덱스 범위내 문자열이 똑같은지를 검사
                i += search.length()-1; // 똑같으면 중복없이 세기위해 인덱스를 뛰어넘겨버림(?)
                count++;
            }
        }

        System.out.println(count);
    }
}
