package programmers;

public class Video {
    public static void main(String[] args) {

        System.out.println(solution("10:55","00:05","00:15","06:55", new String[]{"prev", "next", "next"}));
    }
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String[] video = video_len.split(":");
        int vHour = Integer.parseInt(video[0]);
        int vMin = Integer.parseInt(video[1]);
        int vNowTime = vHour * 60 + vMin;

        String[] temp = pos.split(":");
        int hour = Integer.parseInt(temp[0]);
        int min = Integer.parseInt(temp[1]);
        int nowTime = hour * 60 + min;

        for (String s : commands) {
            if (check(nowTime,op_start,op_end)) {
                pos = op_end;
                temp = pos.split(":");
                hour = Integer.parseInt(temp[0]);
                min = Integer.parseInt(temp[1]);
                nowTime = hour * 60 + min;
            }

            if(s.equals("next")) {
                nowTime += 10;
            } else if(s.equals("prev")) {
                nowTime -= 10;
            }

            if(nowTime > vNowTime) {
                nowTime = vNowTime;
            } else if(nowTime < 0) {
                nowTime = 0;
            } else if (check(nowTime,op_start,op_end)) {
                pos = op_end;
                temp = pos.split(":");
                hour = Integer.parseInt(temp[0]);
                min = Integer.parseInt(temp[1]);
                nowTime = hour * 60 + min;
            }
        }
        int answerHour = nowTime / 60;
        int answerMin = nowTime % 60;
        String zero = answerHour > 10 ? "" : "0";
        return zero+ String.valueOf(answerHour) +":"+ answerMin;
    }
    public static Boolean check(int nowTime, String op_start, String op_end) {

        String[] startTime = op_start.split(":");
        String[] finTime = op_end.split(":");

        int first = Integer.parseInt(startTime[0]) * 60 + Integer.parseInt(startTime[1]);
        int second = Integer.parseInt(finTime[0]) * 60 + Integer.parseInt(finTime[1]);

        return first <= nowTime && second >= nowTime;
    }
}
