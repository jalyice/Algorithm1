import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<Integer> q = new LinkedList<>();
            Queue<Integer> idxq = new LinkedList<>();
            
            st =new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++){
                q.offer(Integer.parseInt(st.nextToken()));
                idxq.offer(j);
                
            }
            int cnt = 1;

            while(!q.isEmpty()){
                int max = Collections.max(q);
                int cur = q.poll();
                int idx = idxq.poll();
                
                if(cur == max){
                    if(idx == M){
                        System.out.println(cnt);
                        break;
                    }
                    cnt++;
                }
                else{
                    q.offer(cur);
                    idxq.offer(idx);
                }
            }
           
        }
        

    }
} 