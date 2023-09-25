import java.io.*;
import java.util.*;

 public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] x, int[] y){
                if(x[1]==y[1]) return Integer.compare(x[0], y[0]);
                return Integer.compare(x[1], y[1]);
            }
        });
        
        for(int i=0; i<N; i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
