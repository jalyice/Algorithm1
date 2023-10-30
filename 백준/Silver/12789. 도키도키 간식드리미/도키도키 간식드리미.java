import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i=0; i<N; i++){
            queue.offer(Integer.parseInt(st.nextToken()));   
        }
        int order = 1;
        while(!queue.isEmpty()){
            if(queue.peek() == order){
                queue.poll();
                order++;
            }
            else if(!stack.isEmpty() && stack.peek() == order){
                stack.pop();
                order++;
            }
            else{
                stack.push(queue.poll());
            }
        }
        while(!stack.isEmpty()){
            if(stack.peek() == order){
                stack.pop();
                order++;
            }
            else{
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
        
        
        
    }
}
