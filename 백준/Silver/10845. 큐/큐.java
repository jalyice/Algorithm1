import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Queue<Integer> q = new LinkedList<>();
        int a = 0;

        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    q.add(num);
                    a=num;
                    break;

                case "pop":
                    if(q.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(q.remove() + "\n");
                    break;

                case "size":
                    bw.write(q.size() + "\n");
                    break;

                case "empty":
                    if(q.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;

                case "front":
                    if(q.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(q.peek() + "\n");
                    break;

                case "back":
                    if(q.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(a + "\n");
                    break;

            }
        }
        bw.close();

    }
} 