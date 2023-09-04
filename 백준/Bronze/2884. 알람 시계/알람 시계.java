import java.io.*;
import java.util.StringTokenizer;



public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if(M>=45) M-=45;
        else {
            M= M+60-45;
            H-=1;
            if(H<0) H= H+23-H; 
        }
        System.out.println(H+" "+M);

	}
}