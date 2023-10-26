import java.io.*;
import java.util.*;
public class Main {
    static boolean[] num = new boolean[1000001];
    public static void get_prime(){
        num[0] = num[1] = true;
        for (int i = 2; i*i <= 1000000; i++) {
            if (!num[i]) {
                for (int j = i+i; j <= 1000000; j += i) {
                    num[j] = true;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        get_prime();
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;
            for(int i = 2; i <= N/2; i++){
                if(!num[i] && !num[N-i]) cnt++;
            }
            System.out.println(cnt);
        } 
    }
}
