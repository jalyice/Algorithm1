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
        String psb = br.readLine();
        String str = br.readLine();
        if(psb.length()>=str.length()) bw.write("go"+ "\n");
        else if(psb.length()<str.length()) bw.write("no"+"\n");
        
       bw.close();    
        
    }
}