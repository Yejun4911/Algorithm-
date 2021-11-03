package programmers;

public class Year2016 {
    public static void main(String[] args) {
        solution(5,24);
    }
    public static String solution(int a, int b) {
        String answer = " ";
        String day[] ={"THU", "FRI","SAT","SUN", "MON", "TUE", "WED"};
        int month[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int sumDate = 0;

        for(int i = 0; i<a; i++){
            sumDate += month[i];
        }

        sumDate += b;

        answer = day[sumDate%7];

        return answer;
    }
}
