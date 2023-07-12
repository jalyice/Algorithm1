import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String S = br.readLine();
        int[] arr = new int[26];
        for(int i=0; i<S.length(); i++){
            char c = S.charAt(i);
            arr[c - 97]++;
        }
        for(int i=0; i<26; i++){
            bw.write(arr[i]+" ");
        }
        bw.write("\n");

        bw.close();    
    
    }
}