import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        Deque<Integer> deq = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while( N-- > 0){
            st = new StringTokenizer(br.readLine());
            switch(Integer.parseInt(st.nextToken())){
                case 1:
                    deq.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deq.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if(deq.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(deq.pollFirst()).append('\n');
                    }
                    break;
                case 4:
                    if(deq.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(deq.pollLast()).append('\n');
                    }
                    break;
                case 5:
                    sb.append(deq.size()).append('\n');
                    break;
                case 6:
                    if(deq.isEmpty()){
                        sb.append(1).append('\n');
                    }
                    else{
                        sb.append(0).append('\n');
                    }
                    break;
                case 7:
                    if(deq.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(deq.getFirst()).append('\n');
                    }
                    break;
                case 8:
                    if(deq.isEmpty()){
                        sb.append(-1).append('\n');
                    }
                    else{
                        sb.append(deq.getLast()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
