import java.io.*;
import java.util.*;

public class Main {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        StringTokenizer st;
        ArrayDeque<Integer> deque;

        int T = Integer.parseInt(br.readLine());
        while( T-- > 0){
            String p = br.readLine();
            int n = Integer.parseInt(br.readLine());
            
            st = new StringTokenizer(br.readLine(), "[],");

            deque = new ArrayDeque<>();
            for(int i=0; i<n; i++){
                deque.add(Integer.parseInt(st.nextToken()));
            }

            AC(p, deque);
        }
        System.out.println(sb);
    }
    public static void AC(String p, ArrayDeque<Integer> deque){
        boolean isRight = true;

        for(char cmd : p.toCharArray()){
            if(cmd == 'R'){
                isRight = !isRight;
                continue;
            }
            
            if(isRight){
                if(deque.pollFirst()==null){
                    sb.append("error\n");
                    return;
                }
            }
            else{
                if(deque.pollLast()==null){
                    sb.append("error\n");
                    return;
                }
            }
        }
        makePrintString(deque, isRight);

    }
    public static void makePrintString(ArrayDeque<Integer> deque, boolean isRight){
        sb.append('[');

        if(deque.size() > 0){
            if(isRight){
                sb.append(deque.pollFirst());
                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollFirst());
                }
            }
        
            else{
                sb.append(deque.pollLast());
                while(!deque.isEmpty()){
                    sb.append(',').append(deque.pollLast());
                }
            }
        }
            sb.append(']').append('\n');
    }
}

