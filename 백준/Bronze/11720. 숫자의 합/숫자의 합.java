import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int num = 0;
        for(int i=0; i<N; i++){
            num += S.charAt(i)-'0';
        }
        bw.write(num+"\n");
        
        
        
        bw.close();    
    
    }
}