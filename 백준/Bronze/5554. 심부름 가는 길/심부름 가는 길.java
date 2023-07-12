import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int school = Integer.parseInt(br.readLine());
        int pcroom = Integer.parseInt(br.readLine());
        int academy = Integer.parseInt(br.readLine());
        int home = Integer.parseInt(br.readLine());

        int min = 0;
        int sec = 0;
    
        min = (school+pcroom+academy+home)/60;
        sec = (school+pcroom+academy+home)%60;
        bw.write(min+"\n");
        bw.write(sec+"\n");
        bw.close();    
    
    }
}