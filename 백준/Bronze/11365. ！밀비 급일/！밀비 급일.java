import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            
            StringBuilder sb = new StringBuilder();
            String s = br.readLine();
            if(s.equals("END"))break;
            sb.append(s);
            sb.reverse();
            bw.write(sb+"\n");
            
        }
        
        bw.close();    
    
    }
}