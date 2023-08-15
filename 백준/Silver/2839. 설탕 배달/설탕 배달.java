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
        
        int cnt = 0;
        int remain = N;

        while(true){
            if(remain%5==0){
                bw.write(remain/5+cnt+"\n");
                break;
            }
            else if(remain<0){
                bw.write(-1+"\n");
                break;
            }
            remain-=3;
            cnt++;
        }
          
		bw.close();
		
    }   
}
