import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int T = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> q = new PriorityQueue<>();
        while(T-- > 0){
            int x = Integer.parseInt(br.readLine());
            if(x == 0){
                if(q.isEmpty()){
                    System.out.println(0);
                }else{
                    System.out.println(q.poll());
                }
            }
            else{
                q.add(x);
            }
        }
        

    }
}

