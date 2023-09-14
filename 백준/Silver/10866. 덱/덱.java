import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Deque<Integer> deq = new LinkedList<>();
        int a = 0;
        int b = 0;
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            switch(str){
                case "push_back":
                    int num = Integer.parseInt(st.nextToken());
                    deq.addLast(num);
                    a=num;
                    break;

                case "push_front":
                    int num1 = Integer.parseInt(st.nextToken());
                    deq.addFirst(num1);
                    b=num1;
                    break;

                case "pop_front":
                    if(deq.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deq.removeFirst() + "\n");
                    break;
                
                case "pop_back":
                    if(deq.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deq.removeLast() + "\n");
                    break;

                case "size":
                    bw.write(deq.size() + "\n");
                    break;

                case "empty":
                    if(deq.isEmpty()) bw.write(1 + "\n");
                    else bw.write(0 + "\n");
                    break;

                case "front":
                    if(deq.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deq.peekFirst() + "\n");
                    break;

                case "back":
                    if(deq.isEmpty()) bw.write(-1 + "\n");
                    else bw.write(deq.peekLast() + "\n");
                    break;

            }
        }
        bw.close();

    }
} 