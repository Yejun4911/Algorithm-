import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String temp ="";
        for(int i=0; i<N; i++){
            String File = br.readLine();
            if(temp.equals("")) temp=File;
            else{
                String temp2="";
                for(int j=0; j<temp.length(); j++){
                    if(File.charAt(j)==temp.charAt(j)) temp2+=File.charAt(j);
                    else temp2+="?";
                }
                temp=temp2;
            }
        }

        System.out.println(temp);
    }
}
