import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder[] sb = new StringBuilder[201];

        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<sb.length; i++){
            sb[i] = new StringBuilder();
        }

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            sb[age].append(age).append(' ').append(name).append('\n');

        }
        StringBuilder p  = new StringBuilder();
        for(StringBuilder val : sb){
            p.append(val);
        }

        System.out.println(p);
    }
} 