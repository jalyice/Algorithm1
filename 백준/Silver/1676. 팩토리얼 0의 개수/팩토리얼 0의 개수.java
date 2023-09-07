import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        cnt += N/5;
        cnt += N/25;
        cnt += N/125;
        
        System.out.println(cnt);
    }

} 