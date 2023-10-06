import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String num = "";
        int result = 0;

        boolean minus = false;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != '-' && s.charAt(i) != '+'){
                num += s.charAt(i);
            }
            
            if(s.charAt(i) == '-' || s.charAt(i) == '+' || i == s.length()-1){
                if(!minus) {
					result += Integer.parseInt(num);
				}else {
					result -= Integer.parseInt(num);
				}
				num = "";
            }
            if(s.charAt(i) == '-') minus = true;
        }
        System.out.println(result);
    } 
}