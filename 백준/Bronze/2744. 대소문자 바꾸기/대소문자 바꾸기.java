import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String N =br.readLine();
        String answer = "";
        for(char x : N.toCharArray()){
           if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
           }
           else{
                answer += Character.toLowerCase(x);
           }
        }
        
        bw.write(answer+"\n");
        bw.close();
        
    }
}