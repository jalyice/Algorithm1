import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int [][]arr1 = new int[N][M];
        int [][]arr2 = new int[N][M];
        int [][]newarr = new int [N][M];

        for(int i=0; i<N; i++){
            String str = br.readLine();
            StringTokenizer stt = new StringTokenizer(str," ");
            for(int j=0; j<M; j++){
                arr1[i][j]=Integer.parseInt(stt.nextToken());
            }
        }
        for(int i=0; i<N; i++){
            String str =br.readLine();
            StringTokenizer stt = new StringTokenizer(str, " ");
            for(int j=0; j<M; j++){
                arr2[i][j] = Integer.parseInt(stt.nextToken());
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                newarr[i][j]=arr1[i][j]+arr2[i][j];
                bw.write(String.valueOf(newarr[i][j])+" ");
            }
            bw.write("\n");
        }
 
        bw.close();
        
    }
}