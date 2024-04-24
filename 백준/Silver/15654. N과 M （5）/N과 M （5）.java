import java.io.*;
import java.util.*;

public class Main {
    public static int N;
    public static int M;
    public static int[] ans;
    public static boolean[] visit;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        ans = new int[N];
        visit = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if(depth == M) {
            for(int i = 0; i < M; i++) {
                sb.append(ans[i]).append(' ');
            }
            sb.append('\n');
            return;
        }
        for (int i = 0; i < N; i++){
            if (!visit[i]){
                visit[i] = true;
                ans[depth] = arr[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}