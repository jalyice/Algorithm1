import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long N1 = Long.parseLong(st.nextToken());
        long N2 = Long.parseLong(st.nextToken());
        long maxval= Math.max(N1,N2);
        long minval=Math.min(N1,N2);
        long sum = ((maxval*(maxval+1))/2) - ((minval*(minval-1))/2);

        System.out.println(sum);   
    }   
}