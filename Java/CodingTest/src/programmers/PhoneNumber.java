package programmers;

public class PhoneNumber {
    public static void main(String[] args) {
        solution("01033334444");
    }

    public static String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
            if( i >= phone_number.length()-4) {
                answer+= phone_number.charAt(i);
            } else {
                answer+="*";
            }
        }
        return answer;
    }
}
