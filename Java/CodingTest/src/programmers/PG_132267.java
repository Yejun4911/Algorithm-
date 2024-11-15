package programmers;

public class PG_132267 {
    public static void main(String[] args) {

        solution(2,1,20);
    }
    public static int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {

            answer += (n/a) * b;
            n = (n/a) * b + (n%a);
//

        }
        return answer;
    }
}
