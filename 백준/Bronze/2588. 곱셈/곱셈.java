import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Num1 = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int Num21=Integer.parseInt(str.substring(2,3));
        int Num22=Integer.parseInt(str.substring(1,2));
        int Num23=Integer.parseInt(str.substring(0,1));
        int multiple1 = Num1 * Num21;
        int multiple2 = Num1 * Num22;
        int multiple3 = Num1 * Num23;

        int answer =multiple1+multiple2*10+multiple3*100;
        bw.write(multiple1+"\n");
        bw.write(multiple2+"\n");
        bw.write(multiple3+"\n");
        bw.write(answer+"\n");
        
    
       
        bw.close();
    }
}