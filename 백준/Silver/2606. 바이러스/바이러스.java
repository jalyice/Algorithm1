import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int map[][];
    static boolean visit[];
    static int n, m, v;
    static int count = 0;
    
    public static int DFS(int i){
        visit[i] = true;

        for(int j=1; j<=n; j++){
            if(map[i][j] == 1 && visit[j] == false){
                count++;
                DFS(j);
            }
        }
        return count;

    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        v=1;
        map = new int[n+1][n+1];
        visit = new boolean[n+1];

        for(int i=1; i<=m; i++){
            st = new StringTokenizer(br.readLine());
            int a  = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = map[b][a] = 1;
        }

        System.out.println(DFS(1));

        
    }
}