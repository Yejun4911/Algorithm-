package programmers;

public class HarshadNumber {
    public static void main(String[] args) {
        solution(10);
    }
    public static boolean solution(int x) {
        boolean answer = true;
        int xCopy = x;
        int sum = 0;
        while (x!=0) {
            sum += x%10;
            x /= 10;
        }

        if (xCopy % sum == 0 ) {
            return true;
        } else {
            return false;
        }

    }
}
