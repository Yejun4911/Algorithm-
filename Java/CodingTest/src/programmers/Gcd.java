package programmers;

public class Gcd {
    public static void main(String[] args) {
        solution(3,12);
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int temp = gcd(n,m);
        answer[0] = temp;
        answer[1] = (n*m)/temp;

        return answer;
    }
    public static int gcd(int N, int M) {
        if (M == 0) return N;
        return gcd(M,N%M);
    }
}
