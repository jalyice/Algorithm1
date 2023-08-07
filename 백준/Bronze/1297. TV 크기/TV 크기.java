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
        
        
        int D = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        double result = Math.pow(D, 2) / (Math.pow(H, 2) + Math.pow(W,2));
    
        bw.write((int)Math.sqrt(result* Math.pow(H,2))+" "+(int)Math.sqrt(result*Math.pow(W,2)));
        bw.write("\n");
        bw.close();
    }
}