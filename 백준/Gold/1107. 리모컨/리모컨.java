import java.io.*;
import java.util.*;

 public class Main {
    static boolean[] broken = new boolean[10];
    
    static int can(int c){
        if(c == 0){
            if(broken[0]) return 0;
            else return 1;
        }
        int len = 0;
        while(c>0){
            if(broken[c%10]){
                return 0;
            }
            len += 1;
            c /= 10;
        }
        return len;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        if(M!=0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int i=0; i<M; i++){
                int x = Integer.parseInt(st.nextToken());
                broken[x] = true;
            }
        }   
        int ans = Math.abs(N - 100);

        for(int i=0; i<1000000; i++){
            int c = i;
            int len = can(c);
            
            if(len>0){
                int press = Math.abs(c - N);
                if(ans > len + press) ans = len + press;
            }
        }
        System.out.println(ans);
               
    }
}