import java.io.*;
import java.util.*;

 public class Main {
    static boolean[] prime = new boolean[246913]; 
    public static void get_prime() {
		// 0 과 1 은 소수가 아니므로 ture
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            int n = Integer.parseInt(br.readLine());
            if( n == 0) break;
            int cnt = 0;
            get_prime();
            for(int i = n + 1; i <= 2*n; i++){
                if(!prime[i]) cnt++;
            }
            System.out.println(cnt);
        }
        
        
    }
}
