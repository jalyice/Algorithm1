import java.io.*;
import java.util.*;

 public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int x[] = new int[N];
        int y[] = new int[N];
        int rank[] = new int[N];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
        
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
            rank[i] = 1;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(x[i]<x[j] && y[i]<y[j]) rank[i]++;
            }
        }
        for(int i=0; i<N; i++){
            System.out.println(rank[i]);
        }

    }
}
