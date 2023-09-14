import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        LinkedList<Integer> list = new LinkedList<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        for(int i=1; i<=N; i++){
            list.add(i);
        }
        bw.write("<");

        int idx = 0;

        while(list.size() > 1){
            idx = (idx + (K-1)) % list.size();

            bw.write(list.remove(idx)+", ");
        }
        bw.write(list.remove()+ ">" + "\n");
        
        bw.close();

    }
} 