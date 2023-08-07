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

        
        int A = Integer.parseInt(st.nextToken()); // 고정 비용 (노트북 판매 대수 상관 x)
        int B = Integer.parseInt(st.nextToken()); // 가변비용 (노트북 한대 생산하는데 드는 비용)
        int C = Integer.parseInt(st.nextToken()); // 노트북 가격
        
        if(C<=B){
            bw.write("-1"+"\n");
        }
        else{
            bw.write((A/(C-B))+1+"\n");
        }        
       
        
        
        
        bw.close();
    }
}