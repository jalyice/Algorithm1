import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Deque<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while( N-- > 0){
            st = new StringTokenizer(br.readLine());
            switch(st.nextToken()){
                case "push":
                    queue.offer(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    Integer it = queue.poll();
                    if(it == null){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(it).append('\n');
                    }
                    break;
                case "size":
                    sb.append(queue.size()).append('\n');
                    break;
                case "empty":
                    if(queue.isEmpty()){
                        sb.append(1).append('\n');
                    }
                    else{
                        sb.append(0).append('\n');
                    }
                    break;
                case "front":
                    Integer ite = queue.peek();
                    if(ite == null){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(ite).append('\n');
                    }
                    break;
                case "back":
                    Integer item = queue.peekLast();
                    if(item == null){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(item).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
