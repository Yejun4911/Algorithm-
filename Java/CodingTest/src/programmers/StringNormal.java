package programmers;

public class StringNormal {
    public static void main(String[] args) {
        solution("as234");
    }
    public static boolean solution(String s) {
        boolean answer = false;
        if ( s.length() == 4 || s.length() == 6) {
            try{
                Integer.valueOf(s);
                return true;
            }catch(Exception e){
                return false;
            }
        }

        return answer;
    }
}
