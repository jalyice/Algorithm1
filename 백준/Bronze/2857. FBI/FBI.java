import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();
        
        if(str1.contains("FBI")) bw.write(1+" ");
        if(str2.contains("FBI")) bw.write(2+" ");
        if(str3.contains("FBI")) bw.write(3+" ");
        if(str4.contains("FBI")) bw.write(4+" ");
        if(str5.contains("FBI")) bw.write(5+" ");
        else if(str1.contains("FBI")==false && str2.contains("FBI")==false && str3.contains("FBI")==false && str4.contains("FBI")==false && str5.contains("FBI")==false) 
        bw.write("HE GOT AWAY!");
        
        bw.write("\n");
        bw.close();
    }
}