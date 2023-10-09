import java.io.*;
import java.util.*;

 public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Map<String, String> map = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            map.put(br.readLine(), "no_listen");
        }
        for(int i=0; i<M; i++){
            String str = br.readLine();
            if(map.containsKey(str)) answer.add(str);
        }
        
        System.out.println(answer.size());
        Collections.sort(answer);
        for(String s : answer){
            System.out.println(s);
        }
        
        
    }
}

