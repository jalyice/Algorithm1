import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int[] answer= new int[6];
        String arr = br.readLine();
        String[] num =  arr.split(" ");
        
        int[] hv= new int[6];
        
        for(int i=0; i< num.length; i++){
            hv[i]=Integer.valueOf(num[i]);
        }
        
        int[] number = {1,1,2,2,2,8};
        
        for(int i=0; i<6; i++){
            if(hv[i]==number[i]) { answer[i]=0; }
            else if(hv[i]>number[i]) {answer[i]=number[i]-hv[i];}
            else if(hv[i]<number[i]) {answer[i]=number[i]- hv[i];}
        }
        
        for(int i=0; i<6;i++){
            bw.write(answer[i]+" ");
        }
        bw.write("\n");
        
        bw.close();
        
    }
}