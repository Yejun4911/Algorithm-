package programmers;

public class PG_340199 {
    public static void main(String[] args) {
        int[] wallet = {30,15};
        int[] bill = {26,17} ;
        solution(wallet,bill);//
    }
    public static int solution(int[] wallet, int[] bill) {
        int answer = 0;

        int first = bill[0];
        int second = bill[1];
        int wallet1 = wallet[0];
        int wallet2 = wallet[1];

        while(true) {
            if(wallet1 >= first && wallet2 >= second) break;
            if(wallet1 >= second && wallet2 >= first) break;
            if(first > second) first = first/2 ;
            else if(first<second) second = second/2;

            // System.out.println(first);
            // System.out.println(second);
            answer++;
        }
        return answer;
    }
}
