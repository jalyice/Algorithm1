import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       StringBuilder sb;
       int T =  Integer.parseInt(br.readLine());
    
       for(int i=0; i<T; i++){
        
        st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();
        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        if(N % H == 0) {
            System.out.println((H * 100) + (N / H));

        } else {
            System.out.println(((N % H) * 100) + ((N / H) + 1));
        }

       }
    
	}
}
