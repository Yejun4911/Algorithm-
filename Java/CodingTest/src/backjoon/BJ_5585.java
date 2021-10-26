import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_5585 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] changeMoney ={500,100,50,10,5,1};
        int money = 1000 - Integer.parseInt(br.readLine());
        int pointer = 0;
        int count = 0;
        while ( money !=0 ) {
            if (changeMoney[pointer] > money ) {
                pointer++;
                continue;
            } else {
                count += money / changeMoney[pointer];
                money -= changeMoney[pointer] * (money / changeMoney[pointer]);
            }

        }

        System.out.println(count);


    }
}
