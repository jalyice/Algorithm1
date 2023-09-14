import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        boolean[] Isprime = new boolean[1000001];
        Isprime[0] = Isprime[1] = true;

        for(int i=2; i*i<=N; i++){
            if(!Isprime[i]){
                for(int j = i*i; j<=N; j+=i){
                    Isprime[j]=true;
                } 
            }
        }
        for(int i=M; i<=N; i++){
            if(!Isprime[i]) System.out.println(i);
        }
    }
} 