import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=28;
        boolean[] arr = new boolean[30];
        while(n-- > 0){
            arr[Integer.parseInt(br.readLine())-1]=true;
        }
        for(int i=0; i<30; i++){
            if(arr[i]==false) bw.write(i+1+"\n");
        }
        bw.close();    
        
    }
}
