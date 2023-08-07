import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int A = Integer.parseInt(br.readLine());

        long sum = 5;
        long dot = 7;
        
        for(int i=1; i<A; i++){
            sum+=dot;
            dot+=3;
        }
        System.out.println(sum%45678);
    }
}