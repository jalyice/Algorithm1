import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        
        boolean[] isprime = new boolean[N+1];
      
        isprime[0]=true;
        isprime[1]=true;
        int sum = 0;
        int min = N;

        for(int i=2; i<=Math.sqrt(isprime.length); i++){
            if(isprime[i])continue;
            for(int j=i*i; j<isprime.length; j+=i){
                isprime[j]=true;
            }
        }

        for(int i=M; i<=N; i++){
            if(isprime[i]==false){
                sum+=i;
                if(min==N){ 
                    min=i; // 첫 소수가 최소값
                }
            }
        }

        if(sum==0){
            System.out.println(-1);
        }
        else{
            System.out.println(sum);
            System.out.println(min);
        }
    }   
}