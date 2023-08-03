import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int cook = Integer.parseInt(br.readLine());
    
        S+= cook;
        if(S>=60){
            M= M+(S/60);
            S= (S%60);
        }
        if(M>=24)  M-=24;
        
        bw.write(M+" "+S);
        bw.write("\n");
        
       
        bw.close();
    }
}