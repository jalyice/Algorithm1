import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String str = br.readLine();
        String[] arr = {"A+", "A0","A-","B+", "B0", "B-", "C+", "C0", "C-","D+", "D0", "D-", "F"};
        double[] score = {4.3, 4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0};
        for(int i =0; i<arr.length;i++){
            if(str.equals(arr[i])){
                bw.write(score[i]+"\n");
            }
        }
        
        bw.close();
        
    }
}