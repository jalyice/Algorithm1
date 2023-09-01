import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr = new int[N+1];

        for(int i=0; i<=N; i++){
            arr[i]=i;
        }
        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if(a==0){
              union(b,c);
            }
            else{
                if(find(b)==find(c)) System.out.println("YES");
                else System.out.println("NO"); 
            }
        }
       
	}
    public static int find(int a){
        if(arr[a] == a ) return a;
		return arr[a] = find(arr[a]);
    }
    public static void union(int a, int b){
        a = find(a);
		b = find(b);
		if(a!=b) arr[b]=a;
    }
}