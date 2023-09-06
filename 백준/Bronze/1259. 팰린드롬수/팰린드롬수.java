import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            
            if(Integer.parseInt(str)==0) break;

            String ReverseStr ="";

            for(int i=str.length()-1; i>=0; i--){
                ReverseStr += str.charAt(i);
            }

            if(str.equals(ReverseStr)) System.out.println("yes");
            else System.out.println("no");

        }

    }
} 