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
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        
        StringTokenizer stt = new StringTokenizer(br.readLine());
        int news1 = Integer.parseInt(stt.nextToken());
        int news2 = Integer.parseInt(stt.nextToken());
        int news3 = Integer.parseInt(stt.nextToken());
        int news4 = Integer.parseInt(stt.nextToken());
        int news5 = Integer.parseInt(stt.nextToken());

        bw.write(news1-(L*P)+" ");
        bw.write(news2-(L*P)+" ");
        bw.write(news3-(L*P)+" ");
        bw.write(news4-(L*P)+" ");
        bw.write(news5-(L*P)+" ");
        bw.write("\n");

        bw.close();    
        
    }
}